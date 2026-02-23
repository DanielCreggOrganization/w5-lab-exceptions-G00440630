package ie.atu.exceptions;
import java.util.Scanner;

public class calculateGrade {
    public static void main(String[] args) {
        System.out.print("Enter your score: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int score = scanner.nextInt();
            String grade = calculateGrade(score);
            System.out.println("Grade: " + grade);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score");
        }
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

}
