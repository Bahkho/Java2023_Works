package Classes;

public class TRex extends Animal {
    private int armLength;


    //The TRex's constructor:
    public TRex(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered, int pArmLength) {
        super(pSpecies, pMaxWeight, pHabitat, pIsEndangered);//Calling the Animal constructor
        this.armLength = pArmLength;
    }

    public String makeSound() {
        return String.format("A %s can make a RAAARRR sounds", super.getSpecies());
    }

    public String toString() {
        return super.toString() + String.format(". My arm length is %d", this.armLength);
    }

}
