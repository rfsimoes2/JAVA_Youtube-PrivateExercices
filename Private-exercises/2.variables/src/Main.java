import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\tdata type\tsize\tprimitive/reference\t\tvalue");
        System.out.println("*\tboolean\t\t1 bit\t\tprimitive\t\t\ttrue or false");
        System.out.println("\tbyte\t\t1 byte\t\tprimitive\t\t\t-128 to 127");
        System.out.println("\tshort\t\t2 bytes\t\tprimitive\t\t\t-32,768 to 32,767");
        System.out.println("*\tint \t\t4 bytes\t\tprimitive\t\t\t-2 billion to 2 billion");
        System.out.println("\tlong\t\t8 bytes\t\tprimitive\t\t\t-9 quintillion to 9 quintillion");
        System.out.println();
        System.out.println("\tfloat\t\t4 bytes\t\tprimitive\t\t\tfractional number up to 6-7 digits ex. 3.141592f");
        System.out.println("*\tdouble\t\t8 bytes\t\tprimitive\t\t\tfractional number up to 15 digits ex. 3.141592653589793");
        System.out.println();
        System.out.println("*\tchar\t\t2 bytes\t\tprimitive\t\t\tsingle character/letter/ASCII value ex. 'f'");
        System.out.println("*\tString\t\tvaries\t\treference\t\t\ta sequence of characters ex. \"Hello world!\"");
        System.out.println();

        boolean A = true;
        byte B = 127;
        short C = 32767;
        int D = 2147483647;
        long E = 9223372036854775807L;
        float F = 3.141592653589793f;
        double G = 3.141592653589793;
        char H = 'f';
        String I = "Hello world!";

        System.out.println("This is a boolean\t"+A);
        System.out.println("This is a byte\t\t"+B);
        System.out.println("This is a short\t\t"+C);
        System.out.println("This is a int\t\t"+D);
        System.out.println("This is a long\t\t"+E);
        System.out.println("This is a float\t\t"+F);
        System.out.println("This is a double\t"+G);
        System.out.println("This is a char\t\t"+H);
        System.out.println("This is a String\t"+I);

    }
}