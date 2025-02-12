public class Main {
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        refrigerator[0] = new Food("apple");
        refrigerator[1] = new Food("banana");
        refrigerator[2] = new Food("orange");

        for(int i = 0; i < refrigerator.length; i++){
            System.out.println(refrigerator[i].name);
        }
        



    }
}