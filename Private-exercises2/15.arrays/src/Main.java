public class Main {
    public static void main(String[] args) {

        //array = used to store multiple values in a single variable

/*    Example #1
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

      cars[0] = "Fiat";
      System.out.println(cars[0]);
*/
        //Example 2
        String[] cars = new String[4];  // you need to pre-set the length
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}