import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //for-each = traversing technique to iterate through the elements in an array/collection
        //              less steps, more reliable
        //              less flexible

        //String[] animals = {"cat","dog","pig","chicken"};
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");

        for (String animal : animals) {
            System.out.println(animal);
        }

    }
}