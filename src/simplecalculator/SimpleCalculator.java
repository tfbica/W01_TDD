package simplecalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleCalculator {

    public int add(String numbers) {

        if ("".equals(numbers)) {
            return 0;
        }

        String[] numbersSeparated = parseNumbers(numbers);

        ArrayList<String> exceptions = new ArrayList<>();

        Integer sum = Arrays.stream(numbersSeparated).
                map(Integer::parseInt).
                filter(n -> {
                    if (n < 0) {
                        exceptions.add(String.valueOf(n));
                        return true;
                    } else {
                        return n <= 1000;
                    }
                }).
                reduce(0, Integer::sum);

        if (exceptions.size() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + String.join(" ", exceptions));
        }

        return sum;
    }

    private String[] parseNumbers(String numbers) {

        String separators = "[,\n]";

        if (numbers.startsWith("//")) {
            int closeNewLineIndex = numbers.indexOf("\n");
            // extract custom separator by removing [ and ]
            String customSeparator = numbers.substring(2, closeNewLineIndex)
                    .replace("[","").replace("]","");
            // replace custom separator by , to simplify split
            numbers = numbers.substring(closeNewLineIndex + 1)
                    .replace(customSeparator, ",");
        }

        return numbers.split(separators);
    }
}
