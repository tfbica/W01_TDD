package fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        if (multiple_of(number, 3) && (multiple_of(number, 5))) {
            return "FizzBuzz";
        }
        if (multiple_of(number, 3)){
            return "Fizz";
        }
        if (multiple_of(number, 5)){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public boolean multiple_of(int number, int multiple) {
        return number % multiple == 0 ;
    }
}
