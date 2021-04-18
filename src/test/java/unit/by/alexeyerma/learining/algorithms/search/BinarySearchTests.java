package unit.by.alexeyerma.learining.algorithms.search;

import by.alexeyerma.learning.algorithms.search.BinarySearch;
import by.alexeyerma.learning.algorithms.search.Search;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTests {
    private Search search;

    @BeforeEach
    void init() {
        search = new BinarySearch<Integer>();
    }

    @Test
    void testFind() {
        final List<Integer> list = IntStream.rangeClosed(0, 65535)
                .boxed().toList();
        assertEquals(search.find(list, 65), Optional.of(65));
    }
}
