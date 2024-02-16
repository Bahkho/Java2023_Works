import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Declaring Arrays in Java:
            int[] myArray = new int[3];
            myArray[0]=1;
            myArray[1]=2;
            myArray[2]=3;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter element number "+(i +1) + ":");
            myArray[i] = sc.nextInt();
        }

            System.out.println("The size of the first array is : "+myArray.length);
            System.out.println("===================================================");
            int[] mySecondaryArray = {10,20,30,40,50};
            double result = 0;
            System.out.println("The size of the second array is : "+mySecondaryArray.length);
            System.out.println("===================================================");

            for (int i = 0; i < mySecondaryArray.length; i++) {
                result += mySecondaryArray[i];
            }
            System.out.println("The student average is : "+result/mySecondaryArray.length);

            //Declaring a 2-D Array:
            double[][] my2DArray = {
                    {1.1,2.3,3.3,4.7,7.8,10.5},
                    {2.3,2.6,5.8},
                    {7.8,5.6,8.9,3.4}
            };
        System.out.println(my2DArray[0][5]);

    }
}