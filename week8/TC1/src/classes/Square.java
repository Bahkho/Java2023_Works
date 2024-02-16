package classes;

public class Square extends Shape{
    private double sideLength;

    public Square(String shapeName, String shapeColor, double sideLength) {
        super(shapeName, shapeColor);
        this.setSideLength(sideLength);
    }


    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea(){
        return this.sideLength * this.sideLength;
    }
}
