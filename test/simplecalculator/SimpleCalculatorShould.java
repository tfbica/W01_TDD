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

    @ParameterizedTest
    @CsvSource({
            // one number
            "4,4",

            // several comma-separated
            "'1,2',3",
            "'3,5',8",
            "'3,10',13",
            "'13,23',36",
            "'1301,2323',3624",
            "'1301,2323,1000',4624",
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
    })
    void return_sum_of_numbers(String numbers, int result) {
        assertEquals(result, calculator.add(numbers));
    }
}