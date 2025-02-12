import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to
        /*
        JFrame frame = new JFrame(); //Creates an instance of a frame
        frame.setVisible(true); // Make frame visible (default is invisible)
        frame.setSize(500, 500); //set dimensions
        frame.setResizable(false); //set the window size to fixed
        frame.setTitle("Frame title goes here"); //Set frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default is hide
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Just to annoy the user

        ImageIcon icon = new ImageIcon("Logo.png"); //Creates an instance of an icon
        frame.setIconImage(icon.getImage());//Change icon of the frame

        frame.getContentPane().setBackground(Color.BLUE); //Set background color to blue
        //frame.getContentPane().setBackground(new Color(0,0,255)); //Set background color to blue
        //frame.getContentPane().setBackground(new Color(0x0000fa)); //now in hexadecimal

        */

        //MyFrame myFrame = new MyFrame(); //create the frame
        new MyFrame();// No variable name set because we don't need to manipulate the frame anymore
    }
}