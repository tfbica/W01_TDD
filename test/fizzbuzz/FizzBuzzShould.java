package fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    private final FizzBuzz fizzBuzz = new FizzBuzz();
    
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void return_string_value_of_integer(int number) {
        assertEquals(String.valueOf(number), fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void return_Fizz_when_multiple_of_3_only(int number) {
        assertEquals("Fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void return_Buzz_when_multiple_of_5_only(int number) {
        assertEquals("Buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void return_Buzz_when_multiple_of_3_and_5(int number) {
        assertEquals("FizzBuzz", fizzBuzz.convert(number));
    }

}
