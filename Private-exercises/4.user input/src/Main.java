import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine(); //To clear out the scanner. necessary after a nextInt()
        System.out.println("Hello: "+name);
        System.out.println(name+" is "+age+" years old");
        System.out.println("What is your favorite color?");
        String color = sc.nextLine();
        System.out.println(name+" is "+age+" years old, and is favorite color is "+color);
    }
}