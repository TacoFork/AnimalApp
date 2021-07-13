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

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.woof());

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.squeak());
    }

    private static void print(String s) {
        System.out.println(s);
    }

    /*What happened: an object of class Animal is made called 'a'. The constructor is run once instantiated.
    Then the eat method is called from the class animal then printed. Then the method sleep is called from the class Animal and printed.
    Animal is the superclass. An object of the class Cat is made called 'c'. Cat is a subclass of Animal and the constructor from Animal is inherited and
    run before the Cat class constructor is run. Then the polymorphed method called eat is run and printed. Same goes for the polymorphed method called sleep
    both in the Cat class. Then the method purr is run which is neither inherited nor polymorphed. An object of the class Bird is made called 'b'. Bird is a subclass
    of Animal and the constructor from Animal is inherited and run before the bird class constructor is run. Then the polymorphed method called eat is run and printed.
    Same goes for the polymorphed method called sleep both in the Bird class. Then the method fly is runs which is neither inherited nor polymorphed.*/
}