import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //array = used to store multiple values in a single variable

/*      String[] cars = new String[2];
        cars[0] = "Sedan";
        cars[1] = "Honda";
        cars[2] = "Audi";
*/
        String[] cars = {"VW","Fiat","Mercedes"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}