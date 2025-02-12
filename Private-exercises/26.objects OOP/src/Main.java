public class Main {
    public static void main(String[] args) {

        //object = and instance of a class that may contain attributes and methods
        //example: (phone, desk, computer, coffee cup)


        Cars car1 = new Cars(); //Lets construct/create a car

        System.out.println("This is car #1");
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.price);
        car1.drive();
        car1.brake();

        Cars car2 = new Cars();
        System.out.println();
        System.out.println("This is car #2"); //this is a second car with the same attributes and methods
        System.out.println(car2.make);
        System.out.println(car2.model);
        car2.drive();
        car2.brake();

    }
}