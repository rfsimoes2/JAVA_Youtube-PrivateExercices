public class Main {
    public static void main(String[] args) {

        //encapsulation = attributes of a class will be hidden or private
        //                Can be accessed only trough methods (getters & setters)
        //                You should make attributes private if you don't have a reason,
        //                to make them public or protected

        Car car = new Car("Fiat","Punto",1999);
//      System.out.println(car.make); //Not possible because is set to private in Car class
//      car.year=2000; //Not possible because "year e set to private
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        car.setMake("Mercedes");
        car.setModel("E270");
        car.setYear(2004);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}