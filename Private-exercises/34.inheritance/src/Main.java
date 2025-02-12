public class Main {
    public static void main(String[] args) {

        //Inheritance = The process where one class acquires,
        //              the attributes and methods of another

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        bicycle.stop();
        System.out.println("This car has "+car.doors+" doors");
        System.out.println("This bicycle has "+bicycle.pedals+ " pedals");
    }
}