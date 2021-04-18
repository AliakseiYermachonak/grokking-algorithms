package by.alexeyerma.learning.algorithms.search;

import java.util.List;
import java.util.Optional;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {

    @Override
    public Optional<T> find(final List<T> list, T item) {
        if (list == null) throw new RuntimeException("Don't try to fool me");
        final int half = list.size() / 2;
        switch (item.compareTo(list.get(half))) {
            case 0: return Optional.of(list.get(half));
            case 1: return find(list.subList(half, list.size()), item);
            case -1: return find(list.subList(0, half), item);
            default: return Optional.empty();
        }
    }
}
