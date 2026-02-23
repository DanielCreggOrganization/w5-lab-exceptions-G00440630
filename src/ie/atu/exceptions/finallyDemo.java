package ie.atu.exceptions;

public class finallyDemo {
    public static void main(String[] args) {
        try { int number = 10;
            int number2 = 0;
            int result = number/number2;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: division by zero.");
        } finally {
            System.out.println("This will always execute, regardless of exceptions.");  
        }
    }
}

