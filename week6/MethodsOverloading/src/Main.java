public class Main {
    public static void main(String[] args) {
        System.out.println("Methods Overloading & Methods Overriding");
        Adder myAdder = new Adder();

        System.out.println(myAdder.add(5,7)); //Calling method # 2
        System.out.println(myAdder.add(5,7,6));//Calling method # 3
        System.out.println(myAdder.add(8,"7"));//Calling method # 4
        System.out.println(myAdder.add("5",9));//Calling method # 5
        System.out.println(myAdder.add("5","7"));//Calling method # 1

        // Overriding
        System.out.println(myAdder.toString());
    }
}