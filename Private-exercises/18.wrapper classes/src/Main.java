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

        Boolean a = true; //autoboxing used
        Character b = '$';
        Integer c = 9;
        Double d = 3.14;
        String e = "Ricardo";

        if(a==true && b=='$' && c==9 && d==3.14 && e=="Ricardo"){
            System.out.println();
            System.out.println("This is a unboxing example");
            System.out.println("Wrapper class is treated like a primitive data type");
        }


    }
}