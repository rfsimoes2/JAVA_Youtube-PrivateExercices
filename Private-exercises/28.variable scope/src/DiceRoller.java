import java.util.Random;

public class DiceRoller {

    Random rand;
    int result=0;

    DiceRoller(){
 //       Random rand = new Random(); //Option #1 using local variables. Passing the values to the method
 //       int result=0; //Option #1 using local variables. Passing the values to the method
        rand = new Random();
 //       roll(rand, result); ///Option #1 using local variables. Passing the values to the method
        roll();

    }
//    void roll(Random rand, int result){     //Option #1 using local variables. Passing the values to the method
    void roll(){
        result = rand.nextInt(6) + 1;
        System.out.println(result);
    }
}
