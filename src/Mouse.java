public class Mouse extends Animal{
    public Mouse(){
        System.out.println("Now I am a mouse!");
    }

    @Override
    public String sleep(){
        return "A mouse sleeps soundly...";
    }

    @Override
    public String eat(){
        return "A mouse eats...";
    }

    public String squeak(){
        return "squeak squeak...";
    }
}
