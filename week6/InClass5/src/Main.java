// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Create a Circle class, with two private properties – radius and colour.
//■ Create a Main class, that will be used to instantiate and interact with your Circle
//        class.
//■ In the Circle class, add a default constructor (no params) that will always create a
//        green circle with a radius of 2.
//■ Add a second overloaded constructor, which allows external classes to control the
//        size of any new circle object.
//■ Add a third constructor, which allows the creation of circles of any size or color on
//        object creation.
//■ Add getter methods for the two properties (this makes them read-only from
//                outside)
//■ Add a getArea method to calculate and return the total area of a circle object.
//        Math.PI may be useful here...
//■ Add a toString() method that will return a description of a circle object, something
//        like “Radius = 2, Colour = Blue”
//■ In the Main class’ PSVM method, write a program to create at least three circle
//        objects (testing each constructor) and interact with the other class methods.
//■ Remember: No console printing should be done from within your Circle class.

        // Creating circle objects using different constructors
        Circle circle1 = new Circle(); // Default constructor
        circle1.setRadius(10);
        Circle circle2 = new Circle(3.5); // Constructor with a specified radius
        circle2.setRadius(20);
        Circle circle3 = new Circle(5, "Red"); // Constructor with a specified radius and color
        circle3.setColor("Black");

        // Accessing and interacting with the circle objects
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        System.out.printf("Area of Circle 1: %.2f%n",circle1.getArea());
        System.out.printf("Area of Circle 2: %.2f%n",circle2.getArea());
        System.out.printf("Area of Circle 3: %.2f%n",circle3.getArea());
    }
}