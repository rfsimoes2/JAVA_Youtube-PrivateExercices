import javax.swing.*;

public class Main {
    public static void main(String[] args) {


       String name = JOptionPane.showInputDialog("Enter your name");
       JOptionPane.showMessageDialog(null, "Hello " + name);

       /*
       //Supposedly the should be a problem getting a intiger into a String. But theres is not!!!
       String age = JOptionPane.showInputDialog("Enter your age");
       JOptionPane.showMessageDialog(null, "You are " + age + " years old");

       String hight = JOptionPane.showInputDialog("Enter your hight");
       JOptionPane.showMessageDialog(null, "You are " + hight + " cm tall");
        */

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));  //Cast the collected string into a int
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double hight = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight")); //Cast the collected string into a double
        JOptionPane.showMessageDialog(null, "You are " + hight + " cm tall");


    }
}