import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //INPUT
        double amountOfPurchase;

        //PROCESSING
        //declare a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome shopper");
        System.out.println("Enter the amount of total purchase: ");
        amountOfPurchase = input.nextInt();
        if (amountOfPurchase < 50){
            amountOfPurchase += 10;
        }else{
            amountOfPurchase += 0;
        }

        //OUTPUT
        System.out.println("Final total including shipping cost:$"+amountOfPurchase);
    }
}