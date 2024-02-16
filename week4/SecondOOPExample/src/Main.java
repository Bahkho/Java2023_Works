import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Garage Example!");

        //Declare part:
        Scanner sc = new Scanner(System.in);

        //Instantiating number of objects:
        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car("Ford", "White", true, 14000);

        System.out.println("Enter the car information for the first car");
        System.out.print("Enter the car's make: ");
        firstCar.carsMake = sc.nextLine();
        System.out.print("Enter the car's color: ");
        firstCar.carsColor = sc.nextLine();
        System.out.print("Enter the car's transmission type(true/false): ");
        firstCar.isAutomatic = sc.nextBoolean();
        System.out.print("Enter the car's price before tax: ");
        firstCar.priceBeforeTax = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter the car information for the second car");
        System.out.print("Enter the car's make: ");
        secondCar.carsMake = sc.nextLine();
        System.out.print("Enter the car's color: ");
        secondCar.carsColor = sc.nextLine();
        System.out.print("Enter the car's transmission type(true/false): ");
        secondCar.isAutomatic = sc.nextBoolean();
        System.out.print("Enter the car's price before tax: ");
        secondCar.priceBeforeTax = sc.nextDouble();

//        System.out.println(firstCar.carsMake);
//        System.out.println(firstCar.carsColor);
//        System.out.println(firstCar.isAutomatic);
//        System.out.println(firstCar.priceBeforeTax);
//
//
//        System.out.println(secondCar.carsMake);
//        System.out.println(secondCar.carsColor);
//        System.out.println(secondCar.isAutomatic);
//        System.out.println(secondCar.priceBeforeTax);

          firstCar.carsReport();
          secondCar.carsReport();
          thirdCar.carsReport();


//        System.out.println(firstCar.getPriceBeforeTax());
//        firstCar.turnLeft();
//        firstCar.turnRight();
//        secondCar.turnLeft();
//        secondCar.turnRight();

    }
}
