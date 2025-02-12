import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z);
        System.out.println(Math.min(x, y));
        System.out.println(Math.abs(y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.round(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
        System.out.println();

        //Now lets find the hypotenuse of a triangle
        double a;
        double b;
        double c;

        System.out.println("Enter side A");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Enter side B");
        b = sc.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is "+c);
        sc.close();

    }
}