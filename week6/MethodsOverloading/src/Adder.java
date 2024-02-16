public class Adder {
    //1
    public String add(String value1, String value2) {
        return value1.concat(value2);
    }

    //2
    public int add(int value1, int value2) {
        return value1 + value2;

    }

    //3
    public int add(int value1, int value2, int value3) {
        return value1 + value2 + value3;

    }

    //4
    public int add(int value1, String value2) {
        return value1 + Integer.parseInt(value2);

    }

    //5
    public String add(String value1, int value2) {
        return value1 + Integer.toString(value2); //String Concatenation

    }

    // Method Overriding
    public String toString() {
        return "Hello From the new declared toString() method";
    }
}
