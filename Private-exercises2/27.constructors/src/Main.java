public class Main {
    public static void main(String[] args) {


                    //constructors = special method that is called when a object is instantiated (created)

        Human human1 = new Human("Ricardo", 25, 60.5);
        Human human2 = new Human("Jorge", 45, 75.5);
        human1.eat();
        human1.sleep();
        human2.eat();
        System.out.println(human2.name+" is "+human2.age+" years old");





    }
}