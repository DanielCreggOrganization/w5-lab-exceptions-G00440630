package ie.atu.exceptions;

public class CommonExceptions {
    public static void main(String[] args) {
        String text = null;
        try {
            // This will throw a NullPointerException because 'text' is null.
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}