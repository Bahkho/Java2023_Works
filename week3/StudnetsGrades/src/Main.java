import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our 1-D Array Example");
        //Declaration Part:
        Scanner sc = new Scanner(System.in);
        double[] stGrades = new double[5];
        double totalGrades = 0.0;
        double stAverage = 0.0;

        System.out.println("The array before data entry: ");

        for (int i = 0; i < stGrades.length; i++) {
            System.out.println(stGrades[i]);
        }



        //1. Input:
        System.out.println("Enter 5 grades: ");
        for (int i = 0; i < stGrades.length; i++) {
            System.out.print("Enter student's grade number "+(i+1) + " : ");
            stGrades[i] = sc.nextDouble();
        }
        double maxValue = stGrades[0];

        for (int i = 0; i < stGrades.length; i++) {
            System.out.println(stGrades[i]);
        }
        System.out.println("Calculating the average");
        for (int i = 0; i < stGrades.length; i++) {
            totalGrades += stGrades[i];
        }
        stAverage = totalGrades/stGrades.length;
        System.out.println("The students' average is : " + stAverage);

        System.out.println(Arrays.stream(stGrades).average()); // Google Average or sum or max or min

        System.out.println("Finding the maximum value: ");
        for (int i = 1; i < stGrades.length; i++) {
            if (stGrades[i]>maxValue)
                maxValue=stGrades[i];
        }
        System.out.println("The highest grade is: " + maxValue);

        System.out.println("Helping some students, by assigning 60 grade to any one got between 50 and 60");
        for (int i = 0; i < stGrades.length; i++) {
            if (stGrades[i]>=50 && stGrades[i] <60){
                stGrades[i] = 60;
            }  //End of if statement.

        }//End of the loop
        //Google printing the array's elements without the for loop
        for (int i = 0; i < stGrades.length; i++) {
            System.out.println(stGrades[i]);
        }
        //Try to see the round or ceil method in Java:
    }
}