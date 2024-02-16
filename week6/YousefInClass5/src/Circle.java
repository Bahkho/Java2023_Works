public class Circle {
   //Create a Circle class, with two private properties – radius and colour.
   private double radius;
    private String colour;
    //In the Circle class, add a default constructor (no params) that will always create a
    //green circle with a radius of 2.

    public Circle(){
        this.setRadius(2);
        this.setColour("green");
    }
    //Add a second overloaded constructor, which allows external classes to control the
    //size of any new circle object.
    public Circle(double radius){
        this.setRadius(radius);
    }
    //Add a third constructor, which allows the creation of circles of any size or color on
    //object creation.
//    public Circle(double radius,String colour){
//        this.setRadius(radius);
//        this.setColour(colour);
//    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }



    /*
 Add getter methods for the two properties (this makes them read-only from
outside)------- We will do it later on, not now
*/
    /*
■ Add a getArea method to calculate and return the total area of a circle object.
Math.PI may be useful here...
     */

    public double getArea(){
        double area = this.getRadius() * this.getRadius() * Math.PI;
        return area;
//        return this.radius * this.radius * Math.PI;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //Add a toString() method that will return a description of a circle object, something
    //like “Radius = 2, Colour = Blue”

    public String toString(){
        return String.format("Radius = %.2f, Colour = %s",this.radius,this.colour);
    }







}
