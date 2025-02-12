import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Logical operators = used to connect two or more expressions

            && = (AND) both conditions must be true
            || = (OR) either condition must be true
             ! = (NOT) reverses a boolean value of condition
         */

/* Example 1
        int temp = 15;

        if (temp > 30) {
            System.out.println("It's hot outside");
        }
        else if (temp >= 20 && temp <= 30) {
            System.out.println("It's warm outside");

        }
*/
        //Example 2
        Scanner sc = new Scanner(System.in);
        System.out.println("You are playing a game. Press q or Q to quit");
        String input = sc.next();
/*
        if (input.equals("q") || input.equals("Q")) {
            System.out.println("You exited the game");
        } else {
            System.out.println("You are continuing to play the game");
*/
        //Example 3 (NOT)
        if (!input.equals("q") && !input.equals("Q")) {
            System.out.println("You are continuing to play the game");

        } else {
            System.out.println("You exited the game");

        }
    }
}