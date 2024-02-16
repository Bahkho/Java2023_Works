import Administration.Accounting.Accountant;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how

        System.out.println("Animal At A Zoo");
        Animal myCat = new Animal();
//        Step 7:
//        Add the three Animals to the Zoo(Object Array).

        Animal[] zoo = new Animal[3];
        ArrayList<Animal> myZoo = new ArrayList<>();
        myZoo.add(new Animal("Dog",30,"Home",false));
        myZoo.add(new Animal("Lion",500,"Jungle",true));
        myZoo.add(new Animal("Cow",900,"Farm",false));
//        Step 8:
//        Let’s interact with our objects, to test their functionality.
//        Create a loop to take each Animal out of the Zoo and call its methods.

        for (Animal myAnimal:myZoo){
            System.out.println(myAnimal.makeSound());
            System.out.println(myAnimal.feedAnimal("Grass"));
            System.out.println(myAnimal);
            System.out.println("=".repeat(50));
        }

        myZoo.get(0).setEndangered(false);
        myZoo.get(1).setMaxWeight(600);
        System.out.println(myZoo.get(1).getMaxWeight());
        System.out.println(myZoo.get(0).isEndangered());

        //Dealing with the administration.:
        Accountant david = new Accountant();
        System.out.println(david.name);

    }
}