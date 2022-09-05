package simplecalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorShould {

    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    void return_0_when_empty_string() {
        assertEquals(0, calculator.add(""));
    }

    @ParameterizedTest
    @CsvSource({
            // one number
            "4,4",

            // several comma-separated
            "'1,2',3",
            "'3,5',8",
            "'3,10',13",
            "'13,23',36",
            "'1,2,3,4',10",

            // new-line separated
            "'1\n2',3",
            "'1\n2\n10',13",

            // new-line and comma separated
            "'1\n2,3',6",
            "'1\n2,3\n4,10', 20",

            // custom separator
            "'//;\n1;2',3",
            "'//;\n1;2,3',6",
            "'//;\n1;2,3\n4',10",

            // arbitrary length separator
            "'//[***]\n1***2***3',6",

            // ignore when > 1000
            "'1301',0",
            "'1301,2',2",
            "'3,1301,2',5",
            "'1301,2323',0",
            "'1301,2323,1,1000',1001",

    })
    void return_sum_of_numbers(String numbers, int result) {
        assertEquals(result, calculator.add(numbers));
    }

    @ParameterizedTest
    @CsvSource({
        "-4,-4",
        "'1,-2',-2",
        "'1,-2,-3',-2 -3",
    })
    void throw_exception_when_number_is_negative(String numbers, String exceptionMessage) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add(numbers));

        assertEquals("negatives not allowed: " + exceptionMessage, exception.getMessage());
    }
}