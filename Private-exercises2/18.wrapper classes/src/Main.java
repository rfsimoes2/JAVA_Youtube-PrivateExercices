public class Main {
    public static void main(String[] args) {

        //wrapper class =   provides a way to use primitive data types as reference data types
        //                  reference data types contain useful methods
        //                  primitives are faster to access than a reference data type
        //                  can be used with collections (ex. ArrayList)


        //primitive     //wrapper
        //---------     //--------
        //boolean       //Boolean
        //char          //Character
        //int           //Integer
        //double        //Double

        //Autoboxing = the automatic conversion that the Java compiler makes between the primitive types and the corresponding object wrapper classes
        //Unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean b = true;
        Character c = 'a';
        Integer i = 10;
        Double d = 10.5;

        //Examples of Unboxing
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(d);



    }
}