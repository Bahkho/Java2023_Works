public class Main {
    public static void main(String[] args) {
        // Create three instances of the House class
        House house1 = new House("House 1", 30, 40, 2, 3); // Name, length, width, bedrooms, bathrooms
        House house2 = new House("House 2", 35, 45, 4, 2); // Name, length, width, bedrooms, bathrooms
        House house3 = new House("House 3", 25, 35, 3, 2); // Name, length, width, bedrooms, bathrooms

        // Invoke methods of each House object
        house1.printDescription();
        house1.printTotalArea();

        house2.printDescription();
        house2.printTotalArea();

        house3.printDescription();
        house3.printTotalArea();
    }
}

