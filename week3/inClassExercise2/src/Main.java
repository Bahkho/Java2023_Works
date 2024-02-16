import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Define arrays for letter grades and their corresponding numeric values
        String[] letterGrades = {"A", "B", "C", "D", "F"};
        int[] numericGrades = {4, 3, 2, 1, 0};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a letter grade
        System.out.print("Enter a letter grade (A, B, C, D, F): ");
        String studentInputGrade = scanner.next(); //Read the input as a string
        String inputGrade = studentInputGrade.toUpperCase(); //  Convert to uppercase

        // Close the scanner
        scanner.close();

        // Convert the input grade to its numeric counterpart
        int numericGrade = -1; // Initialize as an invalid value
        for (int i = 0; i < letterGrades.length; i++) {
            if (inputGrade.equals(letterGrades[i])) {
                numericGrade = numericGrades[i];
                break; // Exit the loop once a match is found
            }
        }

        // Check if the input grade is valid and display the result
        if (numericGrade != -1) {
            System.out.println("The numeric grade for " + studentInputGrade + " is: " + numericGrade);
        } else {
            System.out.println("Invalid input. Please enter a valid letter grade (A, B, C, D, F).");
        }
    }
}