package ie.atu.exceptions;

public class ArithmeticExceptions {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0; // will cause division by zero
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: division by zero.");
        }
    }
}
