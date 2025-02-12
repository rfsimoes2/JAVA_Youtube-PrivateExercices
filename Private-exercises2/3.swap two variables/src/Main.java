public class Main {
    public static void main(String[] args) {

       String x = "x";
       String y = "y";

        System.out.println("x has "+x);
        System.out.println("y has "+y);
        System.out.println("Swapping x and y");
        String temp = x;
        x = y;
        y = temp;
        System.out.println("x has "+x);
        System.out.println("y has "+y);

    }
}