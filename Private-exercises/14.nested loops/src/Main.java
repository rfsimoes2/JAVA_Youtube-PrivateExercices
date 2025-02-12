import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //nested loops = a loop inside a loop

        Scanner sc = new Scanner(System.in);

        int rows;
        int cols;
        String symbol="";

        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = sc.nextInt();
        System.out.println("Enter the symbol: ");
        symbol = sc.next();

        for(int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= cols; j++){
                System.out.print(symbol);
            }
        }


    }
}