public class Main {
    public static void main(String[] args) {
        System.out.println("Methods Terminology!");
        int l = 4; //Declaring a local variable for length
        int w = 5; //Declaring a local variable for width
        //I will declare a new object called myRect using Rectangle class:
        Rectangle myRect = new Rectangle();
        int area = myRect.calcArea(l,w);
        System.out.println(area);
    }
}