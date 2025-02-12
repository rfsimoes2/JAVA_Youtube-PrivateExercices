import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is your age?:");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
//        sc.close();
        sc.nextLine();  //Inportant to clear out scanner buffer after a int
        System.out.println("What is your favorite color?:");
        String color = sc.nextLine();
        System.out.println("Your favorite color is " + color + ".");
        System.out.println();
        System.out.println(name + " is " + age + " years old and likes " + color + ".");
    }
}