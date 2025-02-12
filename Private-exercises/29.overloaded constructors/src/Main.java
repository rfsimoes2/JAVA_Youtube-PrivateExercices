public class Main {
    public static void main(String[] args) {

        //overloaded constructors = multiple constructors within a class with the same name,
        //                          but have different parameters
        //                          name + parameters = signature

        Pizza pizza1 = new Pizza("thick crust","tomato", "mozzarella", "peperoni");
        Pizza pizza2 = new Pizza("thick crust","tomato","mozzarella");
        Pizza pizza3 = new Pizza("thick crust");

        System.out.println("Here is your pizza #1:");
        System.out.println(pizza1.bead);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.topping);

        System.out.println("Here is your pizza #2:");
        System.out.println(pizza2.bead);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.topping);

        System.out.println("Here is your pizza #3:");
        System.out.println(pizza3.bead);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.topping);


    }
}