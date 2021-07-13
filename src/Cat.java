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
