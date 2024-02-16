package classes;

public class Square extends Shape {
    private double sideLength;

    public Square(String shapeName, String shapeColor, double sideLength) {
        super(shapeName, shapeColor);
        //this.sideLength = sideLength;
        this.setSideLength(sideLength);
    }


    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea(){
        double area = this.sideLength * this.sideLength;
        return area;
    }
}
