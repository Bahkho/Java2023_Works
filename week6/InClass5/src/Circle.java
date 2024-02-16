public class Circle {
    // Private properties
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.setRadius(2);
        this.setColor("Green");
    }

    // Overloaded constructor for setting the radius
    public Circle(double radius) {
        this.setRadius(radius);
        this.setColor("Blue");
    }

    // Constructor for setting both radius and color
    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }


    // Getter methods
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    // ToString method to describe the circle
    @Override
    public String toString() {
        return "Radius = " + getRadius() + ", Colour = " + getColor();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}