public class Main {
    public static void main(String[] args) {




        Car car1 = new Car("Fiat","Punto",1999);
//        Car car2 = new Car("Opel","Corsa",2000); //Option#1
//      car2=car1; //this is not a copy of car1. Its just points to the same car1
//        car2.copy(car1); //option #1
        Car car2 = new Car(car1);


        System.out.println(car1); //Print object address
        System.out.println(car2);  //Print object address
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}