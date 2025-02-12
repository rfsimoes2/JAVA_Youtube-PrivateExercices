import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

//        int x = rand.nextInt(6+1); //random number between 1 and 6
//        double x = rand.nextDouble(); //random number between 0 and 1
        boolean x = rand.nextBoolean(); //random boolean value
        System.out.println(x);



    }
}