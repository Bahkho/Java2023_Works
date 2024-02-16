import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal At A zoo Example!");
        /*
        Step 7: In Main() class, create three Animal objects, setting their properties via the constructors.

         */
        Animal myCat = new Animal("Cat",12,"Home",false);
        Animal myLion = new Animal("Lion",500,"Jungle",true);
        Animal myCow = new Animal("Cow",900,"Farm",false);
        /*
        Step 8: Add the three Animals to the Zoo (object array).

         */
        Animal[] myZoo1 = new Animal[3];
        ArrayList<Animal> myZoo2 = new ArrayList<>();

        myZoo1[0] = myCat;
        myZoo1[1] = myLion;
        myZoo1[2] = myCow;

        /*
        Step 9: Let’s interact with our objects, to test their functionality.
        Create a loop to take each Animal out of the Zoo and call its methods.

         */

        for (int i = 0; i < myZoo1.length; i++) {
            System.out.println(myZoo1[i].feedAnimal("grass"));
            System.out.println(myZoo1[i].makeSound());
            System.out.println(myZoo1[i].toString());
            System.out.println("=".repeat(50));
        }

        myZoo2.add(myCat);
        myZoo2.add(myLion);
        myZoo2.add(myCow);

        System.out.println("From Arraylist of Animal using foreach loop");

        for (Animal currentAnimal:myZoo2) {
            System.out.println(currentAnimal.feedAnimal("Milk"));
            System.out.println(currentAnimal.makeSound());
            System.out.println(currentAnimal);
            System.out.println("=".repeat(50));
        }


    }
}