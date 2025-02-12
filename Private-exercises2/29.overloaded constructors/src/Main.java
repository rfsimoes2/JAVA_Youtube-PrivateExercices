import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //overloaded constructors = multiple constructors within a class with the same name,
        //                          but have different parameters
        //                          name + parameters = signature

        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Thick Crust");
        Pizza pizza3 = new Pizza("Thick Crust", "tomato sauce");
        Pizza pizza4 = new Pizza("Thick Crust", "tomato sauce", "mozzarella");
        Pizza pizza5 = new Pizza("Thick Crust", "tomato sauce", "mozzarella", "pepperoni");

        System.out.println("Here are your pizzas:");
        System.out.println("pizza1");
        System.out.println(pizza1.bread+" "+pizza1.sauce+" "+pizza1.cheese+" "+pizza1.toppings);
        System.out.println("pizza2");
        System.out.println(pizza2.bread);
        System.out.println("pizza3");
        System.out.println(pizza3.bread+" "+pizza3.sauce);
        System.out.println("pizza4");
        System.out.println(pizza4.bread+" "+pizza4.sauce+" "+pizza4.cheese);
        System.out.println("pizza5");
        System.out.println(pizza5.bread+" "+pizza5.sauce+" "+pizza5.cheese+" "+pizza5.toppings);



    }
}