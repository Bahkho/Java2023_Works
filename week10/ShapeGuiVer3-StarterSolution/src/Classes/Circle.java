package Classes;


import javax.swing.*;

public class Circle extends Shape {

    //Declare circle-specific properties
    private double radius = 0.0;
    private ImageIcon circlePic;

    //Constructors
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

        circlePic = new ImageIcon(this.getClass().getResource("/Images/circle.png"));
    }

    public ImageIcon getCirclePic() {
        return circlePic;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //toString method to return a description of the object.

    public String toString() {
        return "I'm a circle named " + super.getName() + ". My radius is " + this.radius
                + ". " + super.toString()  ;
    }

    //Circle's implementation of the inherited getArea() method

    public double getArea() {
        //Area = PI * radius squared
        return Math.PI * (this.radius * this.radius);    //or Math.pow(this.radius, 2)
    }


    public String getDimensionsString() {
        return "Radius: " + this.radius;
    }
}
