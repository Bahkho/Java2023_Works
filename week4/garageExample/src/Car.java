public class Car {
    //Any class has the following parts:
    //1.  Attributes or properties or fields: we can declare primitive data type variables:
    String carsMake;
    String carsColor;
    int carsYear;
    boolean isAutomatic;
    double carsPriceBeforeTax;

    //------------------------------------------------------------------------

    //2.  Constructor of any new object:
    //We have three types of constructor:

    //A. The default constructor (This is a hidden constructor): It is a method that create any new object
    // and initialize the default values for its properties/attributes.

    //B. The default constructor with initialized values from you (the programmer): It will override
    //the default values of the assigned properties inside the body of this constructor
    public Car(){
        this.carsMake = "Toyota";
        this.carsColor = "Black";
        this.carsPriceBeforeTax = 15000;
    }
    //------------------------------------------------------------------------

    //3.  Methods or Behaviours:

}
