public class Main {
    public static void main(String[] args) {

        //constructors = special method that is called when a object is instantiated (created)

        Human human1 = new Human("Ricardo", 43, 80); //instance #1
        Human human2 = new Human("Jorge", 23, 75); //instance #2

        System.out.println();
        System.out.println(human1.name+" is "+human1.age+" old, and wights "+human1.weight+" Kg");
        System.out.println(human2.name+" is "+human2.age+" old, and wights "+human2.weight+" Kg");
        human1.eat();
        human2.eat();
        human1.drink();
        human2.drink();

    }
}