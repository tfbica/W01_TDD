package simplecalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorShould {

    @Test
    void return_0_when_empty_string() {
        assertEquals(0, new SimpleCalculator().add(""));
    }

    @Test
    void return_passed_number_when_just_one_number() {
        assertEquals(4, new SimpleCalculator().add("4"));
    }

}
