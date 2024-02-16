package Classes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Cat myCat = new Cat("Cat",30,"Home",false,6);
        System.out.println(myCat.makeSound());
        System.out.println(myCat.feedAnimal("Milk"));
        System.out.println(myCat.toString());
        Shark myShark = new Shark("Shark",2500,"Ocean",true,"Atlantic");
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(myCat);
        animalList.add(myShark);
        System.out.println("From for each");
        System.out.println("=".repeat(150));
        int count = 0;
        for (Animal myAnimal:animalList) {
            System.out.println("Iteration # " + count++);
            System.out.println(myAnimal.toString());
            System.out.println(myAnimal.makeSound());
            System.out.println(myAnimal.feedAnimal()); //Funny thing
            //Down casting
            System.out.println("Down Casting");
            //myAnimal.feedAnimal("Milk"); //This is not allowed

            if (myAnimal instanceof Cat) {
                Cat currentCat = (Cat) myAnimal; //DownCasting
                System.out.println(currentCat.feedAnimal("Mouse"));
                System.out.println(currentCat.makeSound());
            }



        }
        System.out.println("Un Known Animal");
        System.out.println("=".repeat(150));
        Animal myUnspecifiedAnimal = new Animal("Cat",13,"Don't Know",false);
        //Please fix the following two statements by applying either downcasting or upcastiong.
        System.out.println(myUnspecifiedAnimal.makeSound());
        System.out.println(myUnspecifiedAnimal.feedAnimal());
        //The following is Upcasting
        System.out.println("Up Casting");
        System.out.println("=".repeat(150));
        Animal myUnspecifiedAnimal2 = new Cat("Cat",13,"Don't Know",false,7);
        System.out.println(myUnspecifiedAnimal2.makeSound());
    }
}
