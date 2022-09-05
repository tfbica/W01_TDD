package fizzbuzz;

public class FizzBuzz {

    public String convert(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
