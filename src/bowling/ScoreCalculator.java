package bowling;

public class ScoreCalculator {
    public int calculate(String s) {
        String[] scoreArray = s.split("\\|");
        return scoreTotaller(scoreArray);
    }

    private static int scoreTotaller(String[] scoreArray) {
        int total = 0;
        int index = 0;
        boolean hasSpare = false;
        boolean expectingBonus = false;

        for (String frame : scoreArray) {

            if ("".equals(frame)) {

                expectingBonus = true;

            } else if (expectingBonus) {

                String firstTurn = frame.substring(0, 1);
                total += Integer.parseInt(firstTurn);

            } else if (frame.length() == 2) {

                if (frame.contains("/")) {

                    if (hasSpare) {
                        String firstTurn = frame.substring(0, 1);
                        if (Character.isDigit(firstTurn.charAt(0))) {
                            total += Integer.parseInt(firstTurn);
                        }
                    }

                    total += 10;
                    hasSpare = true;

                } else {

                    String firstTurn = frame.substring(0, 1);
                    String secondTurn = frame.substring(1);
                    if (Character.isDigit(firstTurn.charAt(0))) {
                        total += Integer.parseInt(firstTurn);
                        if (hasSpare) {
                            total += Integer.parseInt(firstTurn);
                        }
                    }
                    if (Character.isDigit(secondTurn.charAt(0))) {
                        total += Integer.parseInt(secondTurn);
                    }

                    hasSpare = false;
                }
            }

            index++;
        }

        return total;
    }
}
