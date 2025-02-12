public class Main {
    public static void main(String[] args) {

        //abstract = abstract classes cannot be instantiated, but they can give a subclass
        //           abstract methods are declared without an implementation

//        Vehicle vehicle = new Vehicle(); //Not possible because class is abstract
//        vehicle.go(); //Not possible because method is abstract
        Car car = new Car();
        car.go();

    }
}