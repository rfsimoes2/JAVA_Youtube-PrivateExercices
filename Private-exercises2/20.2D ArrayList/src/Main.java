import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            //2D ArrayList = a dynamic list of lists
            //You can change the size of this lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("apple");
        bakeryList.add("banana");
        bakeryList.add("carrot");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("peppers");
        produceList.add("garlic");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coca-cola");
        drinksList.add("pineapple juice");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(2).get(0));




    }
}