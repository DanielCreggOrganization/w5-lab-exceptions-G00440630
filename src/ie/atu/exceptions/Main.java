package ie.atu.exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Everyone!");
        String text = null;
        if (text != null) {
            System.out.println(text.length());
        } else {
            System.out.println("Text is null — cannot get length.");
        }
        try {
            // This will throw a NullPointerException because 'text' is null.
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

}
