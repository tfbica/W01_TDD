package simplecalculator;

import java.util.Arrays;

public class SimpleCalculator {

    public int add(String numbers) {

        if ("".equals(numbers)) {
            return 0;
        }

        String[] numbersSeparated = parseNumbers(numbers);

        return Arrays.stream(numbersSeparated).
                map(Integer::parseInt).
                reduce(0, Integer::sum);
    }

    private String[] parseNumbers(String numbers) {

        String separators = ",\n";

        if (numbers.startsWith("//")) {
            separators += String.valueOf(numbers.charAt(2));
            numbers = numbers.substring(4);
        }

        return numbers.split("[" + separators + "]");
    }
}
