package simplecalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorShould {

    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    void return_0_when_empty_string() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void return_passed_number_when_just_one_number() {
        assertEquals(4, calculator.add("4"));
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "3,5,8",
            "3,10,13",
            "13,23,36",
            "1301,2323,3624",
    })
    void return_sum_of_two_numbers(String leftArgument, String rightArgument, int result) {
        assertEquals(result, calculator.add(leftArgument + "," + rightArgument));
    }

}