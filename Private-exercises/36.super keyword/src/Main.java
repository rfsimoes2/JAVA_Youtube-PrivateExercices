public class Main {
    public static void main(String[] args) {

        //super = keyword refers to the superclass (parent) of an object
        //        very similar to the "this" keyword

        Hero hero1 = new Hero("Batman",43,"$$$");
        Hero hero2 = new Hero("Superman",46,"Strenght");
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}