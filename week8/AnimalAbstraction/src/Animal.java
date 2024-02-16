public abstract class  Animal {
    //Comprehensive Example:
    /*
 Step 1: Define an Animal class with four properties:
Species – ex. Lion, cow or sloth
Max Weight – The maximum average weight of an adult of the species
Habitat – ex. Jungle, ocean or mountains
Is Endangered – Flag to indicate whether the animal species is endangered

     */
    //Step1: Attributes:
    private String species;
    private int maxWeight;
    private String habitat;
    private boolean isEndangered;


    //-------------------------------------------------
    //Step 2: Add a default constructor, with any default values that
    // you feel may be required
    public Animal(){
        this.setSpecies("Cat");
        this.setMaxWeight(15);
        this.setHabitat("Home");
        this.setEndangered(false);
    }

    /* --------------------------------------------------------
    Step 3: Add a parameterized constructor, to allow setting of all properties on object creation.

     */

    public Animal(String species, int maxWeight, String habitat, boolean isEndangered) {
        this.setSpecies(species); // this.species = species
        this.setMaxWeight(maxWeight);
        this.setHabitat(habitat);
        this.setEndangered(isEndangered);
    }

     /* -------------------------------------------------------------
Step 4: Determine scope/access of properties
Are they completely internal to the class?
Should an external class be permitted to read the property values?
Should an external class be permitted to change the property values?

  */

    /*
    Step 5: Create appropriate getter/setter methods, as required

     */

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    /* ----------------------------------------------------------------------------
Step 6: Create three methods – ie. Actions that Animal instances can do, or that involve Animal objects
Animals can be fed – ex. Feed a tiger a steak.
Animals can make a sound – ex. A cow can moo.
In our program, an animal can report its state. (toString())
Ex. “I am a 500lb tiger that lives in the jungle. I am an endangered species.”
Note: Let’s do all console printing in Main(), not Animal.

     */
    public String feedAnimal(String food){
        //I will declare a local string variable:
        //String result = String.format("Feed a %s a %s.",this.species,food);
        //return result;
        return String.format("Feed a %s a %s.",this.species,food);
    }

    public abstract String makeSound();
//    {
//        String sound;
//        if (this.species.equals("Cat")) {
//            sound ="Meow";
//        }
//        else if (this.species.equals("Lion")) {
//            sound ="Raarrr";
//        }
//        else if (this.species.equals("Dog")) {
//            sound ="WoofWoof";
//        }
//        else if (this.species.equals("Cow")) {
//            sound ="Mooooo";
//        }
//        else {
//           sound = "Un-Specified";
//        }
//        return String.format("A %s can %s.",this.species,sound);
//    }
    public String toString(){
        String animalStatus ="not endangered";
        if (this.isEndangered)
            animalStatus = "an endangered";
        return String.format("I am a %dlb %s that lives in the %s. I am %s species.",
                this.maxWeight,this.species,this.habitat,animalStatus);

    }

}
