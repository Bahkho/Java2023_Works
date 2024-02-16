package classes;

public class Triangle extends  Shape{
    private double base;
    private double height;

    public Triangle(String shapeName, String shapeColor, double base, double height) {
        super(shapeName, shapeColor);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return 0.5 * this.base * this.height;
    }

}
