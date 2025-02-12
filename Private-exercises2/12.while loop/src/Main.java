import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // While loop = executes a block of code as long as it's condition remains true

        Scanner sc = new Scanner(System.in);
        String name = "";

        /*  Example 1
        while(name.equals("")){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }*/

         do{ //On example 2 the block of code is run before checking the condition
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }while(name.equals(""));
        System.out.println("Hello " + name);
    }

}
