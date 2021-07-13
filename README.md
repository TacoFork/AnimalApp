Create a class and name it "Animal".

Copy the following code to the Animal.class:

/*
 * This is the parent class. Also called the super class
 */
public class Animal {
   public Animal() {
      System.out.println("A new animal has been created!");
   }
   public String sleep() {
      return "An animal sleeps...";
   }
   public String eat() {
      return "An animal eats...";
   }
}

 

Create another class and call it "Bird".

Copy the following code to the Bird.java class.

/*
 * All Birds are Animals but all Animals are not Birds
 */
public class Bird extends Animal {
    public Bird() {
        //super();
        System.out.println("A bird is hatched...");
    }


    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}
 

 

Create another class and call it "Cat".

Copy the following code to the Cat.java class.

/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Cat extends Animal {

    public Cat() {
        super();
        System.out.println("Now I am a Cat!");
    }

    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }

}

 

Create the application runner class called "AnimalApp".

Copy the following code to the AnimalApp.java class:


public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}

 

Your Assignment:

What just happened? Comment your understanding of object-oriented programming from the four classes created above. Where is the method executing encapsulation? Inheritance? Or polymorphism?

Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.