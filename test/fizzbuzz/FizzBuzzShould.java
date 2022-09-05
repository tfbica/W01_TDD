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

    @Test
    void when_3_return_Fizz() {
        assertEquals("Fizz", new FizzBuzz().convert(3));
    }

    @Test
    void when_6_return_Fizz() {
        assertEquals("Fizz", new FizzBuzz().convert(6));
    }

    @Test
    void when_9_return_Fizz() {
        assertEquals("Fizz", new FizzBuzz().convert(9));
    }

    @Test
    void when_5_return_Buzz() {
        assertEquals("Buzz", new FizzBuzz().convert(5));
    }

    @Test
    void when_10_return_Buzz() {
        assertEquals("Buzz", new FizzBuzz().convert(10));
    }

    @Test
    void when_20_return_Buzz() {
        assertEquals("Buzz", new FizzBuzz().convert(20));
    }

}
