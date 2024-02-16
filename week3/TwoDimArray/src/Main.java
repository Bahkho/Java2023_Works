import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Two Dim Array");
        Scanner sc = new Scanner(System.in);
        //3 X 3 mat
        int[][] twoDimArray = {
                {10,20,30},
                {5,8,9},
                {88,99,67}
        };
        System.out.println(twoDimArray.length);
        System.out.println(twoDimArray[2].length);
        //Print out the array:
        for (int i = 0; i < twoDimArray.length; i++) {//For the rows
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }

        //Can I change the 2-D array to 1-D array? if yes, how?
        //A. We need to declare a new one-D array:
        int[] oneDimArray = new int[9];
        //B. I will assign the two-D array's elements to the one-D array's elements
        int count = 0;
        for (int i = 0; i < twoDimArray.length; i++) {//For the rows
            for (int j = 0; j < twoDimArray[i].length; j++) {
                oneDimArray[count] = twoDimArray[i][j];
                count++;
            }
        }
        //C. Display the one-D array's elements:
        System.out.println("The converted array is: ");
        for (int i = 0; i < oneDimArray.length; i++) {
            System.out.println(oneDimArray[i]);

        }



    }
}