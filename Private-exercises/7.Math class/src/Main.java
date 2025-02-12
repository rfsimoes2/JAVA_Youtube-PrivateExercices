import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x = 10;
        double y = 5.9;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = sc.nextDouble();
        System.out.println("Enter side y: ");
        y = sc.nextDouble();

//        double z = Math.max(x,y); //Higher nunber of 2
//        double z = Math.abs(y); //Absolute number converter
        double z = Math.sqrt(x * x + y * y); //Square root of the square of one side of a triangle, plus the square of the other
//        double z = Math.round(y); //Round a number
//        double z = Math.ceil(y); //Round up a number
//        double z = Math.floor(y); //Round down a number

        System.out.println("The hypotenuse is: "+z);
        sc.close(); //Donto forget to close the scanner
    }
}