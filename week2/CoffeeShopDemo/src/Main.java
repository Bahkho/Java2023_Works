import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //INPUT
        double priceOfCup = 1.25;
        double priceOfCake = 3.25;
        int numOfCups;
        int numOfCakes;
        double preTaxTotal;
        double finalTotal;
        //declare a scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Coffee Shop");
        System.out.println("Enter the number of cups: ");
        numOfCups = input.nextInt();
        System.out.println("Enter the number of cakes: ");
        numOfCakes = input.nextInt();


        //PROCESSING
        preTaxTotal = numOfCups * priceOfCup + numOfCakes * priceOfCake;
//        finalTotal =  1.15*preTaxTotal;
        finalTotal = preTaxTotal + 0.15*preTaxTotal;

        //OUTPUT
        System.out.println("Your pretax total is $"+preTaxTotal);
        System.out.println("Your final total is $"+finalTotal);
    }
}