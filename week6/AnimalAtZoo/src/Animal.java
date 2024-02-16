public class Animal {
//    Step1:
//Define Animal Class with four properties:
//1. Species -ex. Lion, cow or anything else.
//2. Max Weight – The maximum average weight of an adult of the species.
//3. Habitat – ex. Jungle, ocean, or mountain, … etc.
//4. Is Endangered- Flag to indicate whether the animal species is endangered.
    private String species;
    private int maxWeight; //protected
    private String habitat;
    private boolean isEndangered;
//    Step2:
//    Add a default constructor, with any default values that you feel be required.
    public Animal(){
        this.setSpecies("Cat");
        this.setMaxWeight(12);
        this.setHabitat("Home");
        this.setEndangered(false);
    }
//    Step3:
//    Add a parametrized constructor to allow setting of all properties on object creation.

    public Animal(String species, int maxWeight, String habitat, boolean isEndangered) {
        this.setSpecies(species);
        this.setMaxWeight(maxWeight);
        this.setHabitat(habitat);
        this.setEndangered(isEndangered);
    }

//    Step4:
//    Determine scope/access of properties:
//            - Are they completely internal to the class?
//            - should an external class be permitted to read the property values?
//            - should an external class be permitted to change the property values?
//    Step 5:
//    Create appropriate Getter/Setter methods, as required.


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
//    Step 6:
//    Create three methods, i.e., actions that Animal instances can do, or that involve Animal objects.
//- Animal can be fed-ex. Feed a Tiger a Steak.
//- Animal can make sound-ex. A Cow can “moo”.
//            - In our program, an animal can report its state. (Use toString()):
//            *. Ex., “I am a 500Ib tiger that lives in the jungle. I am an Endangered species.”
//            - Note: Let’s do all console printing in Main(), not Animal.


    public String feedAnimal(String food){
        return String.format("Feed a %s a %s",this.species,food);
    }

    public String makeSound(){
        String sound = "";
        if (this.species.equalsIgnoreCase("cat"))
            sound = "Meowww";

        else if (this.species.equalsIgnoreCase("Cow"))
            sound = "Moooo";

        else if (this.species.equalsIgnoreCase("Lion"))
            sound = "Raaaar";

        else if (this.species.equalsIgnoreCase("Dog"))
            sound = "WoofWoof";

        else
            sound = "Un-Specified";
            return  String.format("A %s can %s",this.species,sound);

    }

    public String toString(){
        String animalStatus = "not Endagered";
        if (this.isEndangered)
            animalStatus = "an Endangered";
            String report = String.format("I am a %dIb %s that lives in the %s. I am %s species.",
                this.maxWeight,this.species,this.habitat,animalStatus);
        return report;
    }
}
