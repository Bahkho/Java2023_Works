public class Main {
    public static void main(String[] args) {
         /*
Exercise: Disks are Loading
■ Create a Circle class, with two private properties – radius and colour.
■ Create a Main class, that will be used to instantiate and interact with your Circle
class.
■ In the Circle class, add a default constructor (no params) that will always create a
green circle with a radius of 2.
■ Add a second overloaded constructor, which allows external classes to control the
size of any new circle object.
■ Add a third constructor, which allows the creation of circles of any size or color on
object creation.
■ Add getter methods for the two properties (this makes them read-only from
outside)
■ Add a getArea method to calculate and return the total area of a circle object.
Math.PI may be useful here...
■ Add a toString() method that will return a description of a circle object, something
like “Radius = 2, Colour = Blue”
■ In the Main class’ PSVM method, write a program to create at least three circle
objects (testing each constructor) and interact with the other class methods.
■ Remember: No console printing should be done from within your Circle class.
     */

        Circle circleOne = new Circle();

        Circle circle4 = new Circle();
        circle4.setColour("Blue");
        circleOne.setRadius(10);

        Circle circleTwo = new Circle(3.5);
        circleTwo.setRadius(20);
        circleTwo.setColour("White");
        Circle circleThree = new Circle(5,"red");
        circleThree.setColour("black");


        System.out.printf("The area is: %.2f%n",circleOne.getArea());
        System.out.printf("The area is: %.2f%n",circleTwo.getArea());
        System.out.printf("The area is: %.2f%n",circleThree.getArea());

        System.out.println(circleOne);
        System.out.println(circleTwo);
        System.out.println(circleThree);

    }
}