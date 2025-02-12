import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?")); //Integer conversion of a string return
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?")); //Double  conversion of a string return
        JOptionPane.showMessageDialog(null, "You are "+height+" m tall");
    }
}