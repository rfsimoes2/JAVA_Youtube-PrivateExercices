public class Main {
    public static void main(String[] args) {

        
        //printf = and optional method to control, format and display text to the console window
        //         2 arguments = format string + (object/variable/value)
        //         %[flags] [precision] with [conversion-character]


        //   System.out.printf("%d This is a format string",123); //%d decimal values

        boolean myBoolean = true;
        char myChar = '*';
        String myString = "Mr Robot";
        int myInt = 123;
        double myDouble = 1000;

        //[conversion character]
        System.out.printf("%b",myBoolean);
        System.out.println();
        System.out.printf("%c",myChar);
        System.out.println();
        System.out.printf("%s",myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f",myDouble);
        System.out.println();

        //[width]
        //minimum number of characters
        System.out.printf("Hello %10s",myString);
        System.out.println();

        //[precision]
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("Precision %.2f ", myDouble);
        System.out.println();

        //[flags]
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("Flag to left-justify %-20f ", myDouble);
        System.out.println();
        System.out.printf("Output + or - sign  %+f ", myDouble);
        System.out.println();
        System.out.printf("Flag to zero-padd %020f ", myDouble);
        System.out.println();
        System.out.printf("Flag to add a group seperator of 1000's %,f ", myDouble); //Why is it adding a space instead of a , or a .?
        System.out.println();



    }
}