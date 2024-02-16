import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letterGrade;
        int numericGrade = 0;

        System.out.println("=".repeat(70));
        System.out.println("Enter your Grade (A,B,C,D): ");
        letterGrade = input.nextLine();
        if (letterGrade.equalsIgnoreCase ("A")) {
            numericGrade = 4;
            System.out.println( "Your numeric grade is : "+ numericGrade);

        } else if (letterGrade.equalsIgnoreCase("B")) {
            numericGrade = 3;
            System.out.println( "Your numeric grade is : "+ numericGrade);

        } else if (letterGrade.equalsIgnoreCase("C")) {
            numericGrade = 2;
            System.out.println( "Your numeric grade is : "+ numericGrade);

        }else if (letterGrade.equalsIgnoreCase("D")) {
            numericGrade = 1;
            System.out.println( "Your numeric grade is : "+ numericGrade);

        }else if (letterGrade.equalsIgnoreCase("F")) {
//            numericGrade = 0;
            System.out.println( "Your numeric grade is : "+ numericGrade);

        }else {
            System.out.println("Please input the correct letter grade");
        }
//        System.out.println( "Your numeric grade is : "+ numericGrade);



    }
}