public class Main {
    public static void main(String[] args) {

        //toString() = a special method that all methods inherit
        //             that returns a string that "textually represents" an object.
        //             can be used both implicitly or explicitly

        Car car = new Car();
        System.out.println(car); //toString called implicitly
        System.out.println(car.toString()); //toString called explicitly
        System.out.println(car.whatEver()); //My own method called. Why use toString then?

    }
}