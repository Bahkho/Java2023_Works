public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance Example!");

        Animal myCat = new Animal("Wild Cat",30,"Jungle", true);
        Cat yousefsCat = new Cat("Cat",15,"Home",false,6);
        System.out.println(myCat.toString());
        System.out.println(myCat.makeSound());
        System.out.println(yousefsCat.toString());
        System.out.println(yousefsCat.makeSound());

        //The following is a concept of DownCasting:
        //I am instantiating a parent object using the child constructor.

        Animal strangeCat = new Cat("Strange Cat",50,"Zoo",true,10);
        System.out.println(strangeCat.makeSound());

        // Fix the following statement by searching for the upcasting concept
        //Cat upCastedCat = new Animal("Cat",70,"Home",false);

    }
}