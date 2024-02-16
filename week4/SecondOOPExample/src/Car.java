public class Car {

    //1. Attributes:
    String carsMake;
    String carsColor;
    boolean isAutomatic;
    double priceBeforeTax;

    //2. Constructor:-----------------------------------------------------------
    //A. The default constructor without parameters:
    public Car(){
        this.carsMake = "Toyota";
        this.carsColor = "Black";
        this.isAutomatic =  true;
        this.priceBeforeTax = 1000;
    }

    //B. The user defined constructor with parameters:
    public Car(String pCarsMake, String pCarsColor, boolean pIsAutomatic, double pPriceBeforeTax){
        this.carsMake = pCarsMake;
        this.carsColor = pCarsColor;
        this.isAutomatic = pIsAutomatic;
        this.priceBeforeTax = pPriceBeforeTax;
    }

    //3. The methods OR Behaviours:----------------------------------------------------

    //Access-Modifiers void/dataType ()
    public void turnLeft() {
        System.out.println("Turn left");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }

    //A. method that is going to print out the price before tax for any object:
    public double getPriceBeforeTax() {
        return this.priceBeforeTax;
    }


    public void carsReport () {
        System.out.println("Car's make: " + this.carsMake + " -".repeat(3) +
                " Car's Color: " + this.carsColor + " -".repeat(3) +
                " Car's Transmission Type: " + this.isAutomatic + " -".repeat(3) +
                " Car's Price before tax: " + this.priceBeforeTax);
        System.out.println("The price after tax is: " + 1.15*this.priceBeforeTax);
    }
}
