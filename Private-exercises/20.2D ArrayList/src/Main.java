import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //2D ArrayList = a dynamic list of lists
        //You can change the size of this lists during runtime


        ArrayList<ArrayList<String>> grocerielist = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("beer");
        drinksList.add("red wine");

        grocerielist.add(bakeryList);
        grocerielist.add(produceList);
        grocerielist.add(drinksList);

        System.out.println();
        System.out.println(grocerielist);
        System.out.println();
        System.out.println(grocerielist.get(0));
        System.out.println();
        System.out.println(grocerielist.get(0).get(2));


    }
}