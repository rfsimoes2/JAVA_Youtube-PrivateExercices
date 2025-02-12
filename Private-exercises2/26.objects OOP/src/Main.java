public class Main {
    public static void main(String[] args) {

        //object = and instance of a class that may contain attributes and methods
        //example: (phone, desk, computer, coffee cup)

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        car1.drive();
        car1.stop();

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        car2.drive();
        car2.stop();



    }
}