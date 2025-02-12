import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // nested loops = a loop inside of a loop

        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println( "Enter the number of rows:" );
        rows = sc.nextInt();
        System.out.println( "Enter the number of columns:" );
        columns = sc.nextInt();
        System.out.println( "Enter the symbol:" );
        symbol = sc.next();

        for ( int i = 0; i < rows; i++ ) {
            System.out.println();
            for ( int j = 0; j < columns; j++ ) {
                System.out.print( symbol );
            }
        }
        sc.close();
    }
}