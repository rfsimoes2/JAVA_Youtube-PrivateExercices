public class Main {
    public static void main(String[] args) {

        Food food1 = new Food("pizza");
        Food food2 = new Food("meat");
        Food food3 = new Food("yogurt");

        /*
        Food[] refrigerator = new Food[3]; //Option #1
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
*/
        Food[] refrigerator = {food1, food2, food3}; //Option #2

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);



    }
}