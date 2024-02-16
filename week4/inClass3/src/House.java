public class House {

    String name;
    double length;
    double width;
    int bedrooms;
    int bathrooms;
    // Constructor to set property values
    public House(String pName, double pLength, double pWidth, int pBedrooms, int pBathrooms) {
        this.name = pName;
        this.length = pLength;
        this.width = pWidth;
        this.bedrooms = pBedrooms;
        this.bathrooms = pBathrooms;
    }

    // Method to print the total square footage of the house
    public void printTotalArea() {
        double totalArea = length * width;
        System.out.println(name + " has a total area of " + totalArea + " square feet.");
    }

    // Another method to print a description of the house
    public void printDescription() {
        System.out.println(name + " is a " + bedrooms + " bedroom, " + bathrooms + " bathroom house.");
    }
}
