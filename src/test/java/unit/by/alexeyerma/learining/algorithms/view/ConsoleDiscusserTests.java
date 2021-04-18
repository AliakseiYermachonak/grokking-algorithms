package unit.by.alexeyerma.learining.algorithms.view;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import by.alexeyerma.learning.algorithms.view.ConsoleDiscusser;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ConsoleDiscusserTests {
    private ConsoleDiscusser consoleDiscusser;
    private InputStream originalSystemIn;
    private InputStream systemInStub;

    @BeforeEach
    void init() {
        originalSystemIn = System.in;
        consoleDiscusser = new ConsoleDiscusser();
    }

    @AfterEach
    void tearDown() {

        System.setIn(originalSystemIn);
    }

    @Test
    void testReadInputLine() throws IOException {
        try {
            systemInStub = new ByteArrayInputStream(("testReadLine").getBytes(StandardCharsets.UTF_8));
            System.setIn(systemInStub);
            assertEquals(consoleDiscusser.readInputLine(), "testReadLine");
        } catch (Exception e) {
            fail();
        } finally {
            systemInStub.close();
        }
    }
}
