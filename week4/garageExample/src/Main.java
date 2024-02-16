import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //I will create a new object using the Car class:
        Car xandersCar = new Car();
        Car abdulCar = new Car();

        xandersCar.carsMake = "Honda";
        xandersCar.carsColor = "Blue";
        xandersCar.carsPriceBeforeTax = 12000;
        xandersCar.carsYear = 2020;
        xandersCar.isAutomatic = true;

        System.out.println(xandersCar.carsPriceBeforeTax);
        System.out.println(xandersCar.carsColor);
        System.out.println(xandersCar.carsYear);
        System.out.println(xandersCar.isAutomatic);
        System.out.println(xandersCar);

        System.out.println(abdulCar.carsPriceBeforeTax);
        System.out.println(abdulCar.carsColor);
        System.out.println(abdulCar.carsYear);
        System.out.println(abdulCar.isAutomatic);
        System.out.println(abdulCar);

    }
}