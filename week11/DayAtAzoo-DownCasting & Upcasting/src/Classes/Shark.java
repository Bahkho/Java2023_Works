package Classes;

public class Shark extends Animal{
    private String oceanName;

    //constructor
    public Shark(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered, String pOceanName){
        super(pSpecies, pMaxWeight, pHabitat, pIsEndangered);
        this.setOceanName(pOceanName);
    }

    //methods
    public String makeSound(){ //overriding the make sound method
//        return super.makeSound("water sloshing"); //calling the parent method
        return String.format("A %s can make a water slashing sound", super.getSpecies());
    }

//    public String feedAnimal(){
//        return super.feedAnimal("seals");
//    }

    public String toString(){
        return super.toString() + String.format("I live in the %s ocean", this.getOceanName());
    }

    //setters and getters
    public String getOceanName() {
        return oceanName;
    }

    public void setOceanName(String oceanName) {
        this.oceanName = oceanName;
    }
}
