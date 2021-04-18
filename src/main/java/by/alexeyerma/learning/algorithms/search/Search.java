package by.alexeyerma.learning.algorithms.search;

import java.util.List;
import java.util.Optional;

public interface Search<T> {
    Optional<T> find(final List<T> list, final T item);
}
