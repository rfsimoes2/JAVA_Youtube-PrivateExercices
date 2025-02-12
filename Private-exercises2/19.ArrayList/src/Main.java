import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

                //ArrayList =   a resizeable array.
                //              Elements can be added and removed after compile time
                //              Store reference data types


        ArrayList<String> myList = new ArrayList<>();

        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        System.out.println("#1 "+myList);

        myList.remove(1);
        System.out.println("#2 "+myList);
        System.out.println("#3 "+myList.get(1));
        System.out.println("#4 "+myList.size());
        System.out.println("#5 "+myList.isEmpty());
        System.out.println("#6 "+myList.contains("Hello"));
        System.out.println("#7 "+myList.indexOf("Hello"));
        System.out.println("#8 "+myList.lastIndexOf("Hello"));
        System.out.println("#9 "+myList.subList(1, 2));

    }
}