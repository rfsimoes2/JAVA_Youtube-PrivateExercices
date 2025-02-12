//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String A = "Water";
        String B = "Tang";
        String temp;

        System.out.println("Variable 'A' has: "+A);
        System.out.println("Variable 'B' has: "+B);
        System.out.println("Now lets swap the variables");

        temp=A;
        A=B;
        B=temp;

        System.out.println("Variable 'A' has: "+A);
        System.out.println("Variable 'B' has: "+B);
    }
}