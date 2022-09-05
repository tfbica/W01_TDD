package simplecalculator;

public class SimpleCalculator {
    public int add(String number) {

        if ("".equals(number)) {
            return 0;
        }

        if (number.contains(",")) {
            String[] arguments = number.split(",");

            return Integer.parseInt(arguments[0])
                    + Integer.parseInt(arguments[1]);
        }

        return Integer.parseInt(number);
    }
}
