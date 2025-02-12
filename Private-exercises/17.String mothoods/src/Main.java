public class Main {
    public static void main(String[] args) {

        //String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = "  Ricardo   ";

        boolean result = name.equals("Ricardo");
        boolean result2 = name.equals("ricardo");
        boolean result3 = name.equalsIgnoreCase("ricardo");
        int result4 = name.length();
        char result5 = name.charAt(0);
        int result6 = name.indexOf("a");
        boolean result7 = name.isEmpty();
        String result8 = name.toUpperCase();
        String result9 = name.trim();
        String result10 = name.replace('r', 'B');

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);

    }
}