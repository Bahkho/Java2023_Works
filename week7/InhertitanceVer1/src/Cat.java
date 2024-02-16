public class Cat extends Animal {



    //extends Animal, means:
    //1. Cat class will get a copy  of all the Animal class parts:
        //a. Attributes.
        //b. Constructors.
        //c. Methods

    //I can add the unique attributes for this child class.
    private int whiskersLength;

    /*
     private String species;
    private int maxWeight;
    private String habitat;
    private boolean isEndangered;
     */

    //The Cat Constructors:
    public Cat(String species, int maxWeight, String habitat, boolean isEndangered,int whiskersLength){
        //As I am a lazy child, I will ask my parent to assign it's 4 attributes:
        //I will call the Parent Constructor using super():
        super(species,maxWeight,habitat,isEndangered);
        //I will take care of mine:
        this.whiskersLength = whiskersLength;
    }

    public String makeSound(){
        String sound = String.format("A %s can make a %s sound.",super.getSpecies(),"Meoww");
        return sound;
    }
    public String toString(){
        return super.toString() + String.format(" My whiskers length is %d CM.",this.whiskersLength);

    }

    public int getWhiskersLength() {
        return whiskersLength;
    }

    public void setWhiskersLength(int whiskersLength) {
        this.whiskersLength = whiskersLength;
    }



}
