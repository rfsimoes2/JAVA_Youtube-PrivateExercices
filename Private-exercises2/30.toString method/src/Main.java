public class Main {
    public static void main(String[] args) {

                    //toString() = a special method that all methods inherit
                    //             that returns a string that "textually represents" an object.
                    //             can be used both implicitly or explicitly

        Car car = new Car();
        System.out.println(car); //Implicitly called
        System.out.println(car.toString()); //Explicitly called


    }
}