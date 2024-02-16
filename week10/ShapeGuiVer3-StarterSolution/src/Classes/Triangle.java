package Classes;

import javax.swing.*;

public class Triangle extends Shape {

    //Declare triangle-specific properties
    private int base;
    private int height;

    //Constructor
    public Triangle(String name, int base, int height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //toString method to return a description of the object.
    public String toString() {
        return "I'm a triangle named " + super.getName() + ". My base is " + this.base +
                " and my height is " + this.height + ". " + super.toString();
    }

    //Triangle's implementation of the inherited getArea() method

    public double getArea() {
        //Area = (base * height)/2
        return (this.base * this.height)/2;
    }


    public String getDimensionsString() {
        return "Base: " + this.base + ", Height: " + this.height;
    }
}
