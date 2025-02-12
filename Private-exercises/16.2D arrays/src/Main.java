public class Main {
    public static void main(String[] args) {

        //2D array = and array of arrays
/*
        String[][] cars =   {
                                {"Fiat", "VW", "Opel"},
                                {"Honda", "Mugen", "Ferrari"},
                                {"Peugeot", "Mercedes", "Land Rover", "Volvo"}
                            };
 */

    String[][] cars = new String[3][3];

    cars[0][0] = "Fiat";
    cars[0][1] = "VW";
    cars[0][2] = "Opel";
    cars[1][0] = "Honda";
    cars[1][1] = "Mugen";
    cars[1][2] = "Ferrari";
    cars[2][0] = "Peugeot";
    cars[2][1] = "Mercedes";
    cars[2][2] = "Land Rover";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
                System.out.println();
            }
        }

    }
}