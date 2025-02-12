import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // While loop = executes a block of code as long as it's condition remains true

        Scanner sc = new Scanner(System.in);
        String name = "";

/* Example 1
        while(name.isBlank()){
            System.out.println("Please enter your name: ");
            name = sc.nextLine();
        }
        */
        do {
            System.out.println("Please enter your name: ");
            name = sc.nextLine();
        } while(name.isBlank());
        System.out.println("Hello: " + name);

    }
}