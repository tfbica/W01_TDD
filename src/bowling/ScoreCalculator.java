package bowling;

public class ScoreCalculator {
    public int calculate(String s) {
        String[] scoreArray = s.split("\\|");
        return scoreTotaller(scoreArray);
    }

    private static int scoreTotaller(String[] scoreArray) {
        int total = 0;
        for (String frame : scoreArray) {
            String firstTurn = frame.substring(0, 1);
            String secondTurn = frame.substring(1);
            if (Character.isDigit(firstTurn.charAt(0))) {
                total += Integer.parseInt(firstTurn);
            }
            if (Character.isDigit(secondTurn.charAt(0))) {
                total += Integer.parseInt(secondTurn);
            }
        }
        return total;
    }
}
