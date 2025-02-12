import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList =   a resizeable array.
        //              Elements can be added and removed after compile time
        //              Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
//        food.clear();

//        for (int i=0; i<food.size(); i++){
        for (String s : food) {  //example of enhanced for
//            System.out.println(food.get(i));
            System.out.println(s);
        }
    }
}