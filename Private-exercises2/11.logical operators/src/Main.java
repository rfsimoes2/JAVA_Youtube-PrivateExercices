import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            //Logical operators = used to connect two or more expressions
            //
            //      && = (AND) both conditions must be true
            //      || = (OR) either condition must be true
            //      ! = (NOT) reverses a boolean value of condition


/*  AND operator example

            int temp = 10;

            if(temp >= 30){
                System.out.println("It's hot");
            } else if (temp>=10 && temp<=29) {
                System.out.println("It's warm");
            } else if(temp<10){
                System.out.println("It's cold");
            }

 */

 /*     Example of a OR operator


        Scanner input = new Scanner(System.in);
        System.out.println("You are playing a game, press \"q\" or \"Q\" to quit");
        String answer = input.nextLine();
        if(answer.equals("q") || answer.equals("Q")){
            System.out.println("You quit the game");
        }else {
            System.out.println("You are still playing");
        }
        input.close();

  */

    //    Example of a NOT operator


        Scanner input = new Scanner(System.in);
        System.out.println("You are playing a game, press \"q\" or \"Q\" to quit");
        String answer = input.nextLine();
        if(!answer.equals("q") && !answer.equals("Q")){
            System.out.println("You are still playing");
        }else {
            System.out.println("You quit the game");
        }
        input.close();
    }
}