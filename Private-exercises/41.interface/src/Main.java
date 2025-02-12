public class Main {
    public static void main(String[] args) {

        //interface = a template that can be applied to a class
        //            similar to inheritance, but specifies what a class has/must do.
        //            classes can apply more than one interface, inheritance is limited to 1 superclass

        Rabbit r = new Rabbit();
        r.flee();
        Hawk h = new Hawk();
        h.hunt();
        Fish f = new Fish();
        f.flee();
        f.hunt();

    }
}