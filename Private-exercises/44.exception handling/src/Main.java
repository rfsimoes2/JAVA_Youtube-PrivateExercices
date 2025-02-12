import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //exception = an event that occurs during program,
            //              execution that disrupts normal flow of instructions

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = sc.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = sc.nextInt();

            int z = x / y;

            System.out.println("The result is: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("Program exited with error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("You did not input a number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }
        finally { //finally always runs after try
            System.out.println("Closing program");
           sc.close();
        }
    }
}