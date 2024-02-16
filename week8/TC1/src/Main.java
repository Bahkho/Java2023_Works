import classes.Circle;
import classes.Square;
import classes.Triangle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Tech Check 1");

        Circle myCircle =new Circle("Circle","Red", 10);
        Square mySquare = new Square("Square", "Blue",5);
        Triangle myTriangle = new Triangle("Triangle", "White", 10,5);

        System.out.println("The Circle's area is:" + myCircle.getArea());
        System.out.println("The square's area is:" + mySquare.getArea());
        System.out.println("The triangle's area is:" + myTriangle.getArea());


    }
}