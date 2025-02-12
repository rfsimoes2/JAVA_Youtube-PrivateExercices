import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int x;
        double y;
        boolean z;

        Random random = new Random();

        x = random.nextInt(10)+1; //pass the maximum number to random and add 1 because it starts at 0
        y = random.nextDouble();
        z = random.nextBoolean();

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);


    }
}