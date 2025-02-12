public class Main {
    public static void main(String[] args) {

            //2D array = an array of arrays

        //Example 1
        /*
        String[][] cars =   {   {"Volvo", "BMW", "Ford"},
                                {"Mazda", "Mercedes", "Audi"},
                                {"Fiat", "Ferrari", "Smart"}
                            };
        */

        //Example #2
        String[][] cars = new String[3][3];

        cars[0][0]="Volvo";
        cars[0][1]="BMW";
        cars[0][2]="Ford";
        cars[1][0]="Mazda";
        cars[1][1]="Mercedes";
        cars[1][2]="Audi";
        cars[2][0]="Fiat";
        cars[2][1]="Ferrari";
        cars[2][2]="Smart";


        for (int i=0; i<cars.length; i++) {
            System.out.println();
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}