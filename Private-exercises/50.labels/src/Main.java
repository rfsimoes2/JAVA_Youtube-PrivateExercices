import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JLabel = A GUI display area for a string of text, an image, or both

        ImageIcon icon = new ImageIcon("Logo-143x145.png");

        JLabel label = new JLabel("Hello World");  //Create and immediately set text for the new label
        label.setIcon(icon); //Set an icon as a label
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER or RIGHT of icon
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text TOP, CENTER, or BOTTOM of icon
//        label.setForeground(Color.RED); //set text color to RED
//        label.setForeground(new Color(255,0,0)); //set text color to RED in RGB
        label.setForeground(new Color(0xFF0000)); //set text color to RED in HEX
        label.setFont(new Font("Arial", Font.BOLD, 20)); //set the text font, style and size
        label.setIconTextGap(50); //set the gap between the tex and the icon
        label.setBackground(Color.BLACK); //Set the background color (currently transparent)
        label.setOpaque(true); //set the background to opaque
        label.setBorder(BorderFactory.createLineBorder(Color.RED,5)); //set the label borderline and paint it RED ant set the thickness
        label.setVerticalAlignment(JLabel.CENTER); //set the icon+text vertical alignment withing the label
        label.setHorizontalAlignment(JLabel.CENTER); //set the icon+text horizontal alignment withing the label
        //label.setBounds(100,100,250,250); //set the position and size of our icon+text


        JFrame frame = new JFrame("My first GUI");
        //frame.setSize(500, 500); // set the FRAME size
        //frame.setLayout(null); //Default layout label uses the entire frame, so we can change that (need to setBounds after this)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //Automatically adjusts the frame size to the label used (Important! must be set in last)



    }
}