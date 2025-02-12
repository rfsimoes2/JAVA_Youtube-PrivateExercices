import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setVisible(true); // Make frame visible (default is invisible)
        this.setSize(500, 500); //set dimensions
        this.setResizable(false); //set the window size to fixed
        this.setTitle("Frame title goes here"); //Set frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default is hide
        //this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE); //Just to annoy the user

        ImageIcon icon = new ImageIcon("Logo.png"); //Creates an instance of an icon
        this.setIconImage(icon.getImage());//Change icon of the frame

        this.getContentPane().setBackground(Color.BLUE); //Set background color to blue 
    }
}
