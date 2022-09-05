package simplecalculator;

import java.util.Objects;

public class SimpleCalculator {
    public int add(String number) {

        if (Objects.equals(number, "")) {
            return 0;
        }
        return Integer.valueOf(number);
    }
}
