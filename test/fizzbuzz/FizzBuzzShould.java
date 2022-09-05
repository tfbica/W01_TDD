package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @Test
    void when_1_return_1() {
        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    void when_2_return_2() {
        assertEquals("2", new FizzBuzz().convert(2));
    }

    @Test
    void when_4_return_4() {
        assertEquals("4", new FizzBuzz().convert(4));
    }
}
