public class Main {
    public static void main(String[] args) {

                //String = a reference data type that can store one or more characters
                //          reference data types have access to useful methods

        String name = "Ricardo";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); //removes spaces
        System.out.println(name.substring(0, 3));
        System.out.println(name.replace("Ric", "Rik"));



    }
}