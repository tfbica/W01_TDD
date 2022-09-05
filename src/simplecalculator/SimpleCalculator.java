package simplecalculator;

import java.util.Arrays;

public class SimpleCalculator {
    public int add(String numbers) {

        if ("".equals(numbers)) {
            return 0;
        }

        String[] arguments = numbers.split("[,\n]");
        return Arrays.stream(arguments).map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
