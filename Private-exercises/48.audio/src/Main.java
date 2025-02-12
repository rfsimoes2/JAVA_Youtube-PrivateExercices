import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {


        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\rfsim\\OneDrive\\Ambiente de Trabalho\\Good Energy.wav");
        AudioInputStream as = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(as);
        String response ="";

        while(!response.equals("Q")){
            System.out.println(response);
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");
            response = sc.nextLine();
            response = response.toUpperCase();

            switch (response){
                case "P": clip.start();
                break;
                case "S": clip.stop();
                break;
                case "R": clip.setMicrosecondPosition(0);
                break;
                case "Q": clip.stop();
                break;
                default: System.out.println("Invalid choice");
            }

        }
        System.out.println("Bye!");

    }
}