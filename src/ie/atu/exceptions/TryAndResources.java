package ie.atu.exceptions;
import java.util.Scanner;

public class TryAndResources {  
    public static void main (String[] args){
        try (Scanner scanner = new Scanner (System.in);) {
            System.out.print ("Enter you age: ");
            int age = scanner.nextInt();
            System.out.println ("Your age is: " + age + "?");

        } catch (Exception e) {
            System.out.println ("An error occurred: " + e.getMessage());
        }
    }

}
