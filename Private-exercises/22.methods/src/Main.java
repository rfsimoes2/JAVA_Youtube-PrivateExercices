public class Main {
    public static void main(String[] args) {

        //method = a block of code that is executed whenever it is called upon
/*
        String name ="Ricardo";
        int age=41;
        hello(name, age); //method invocation
*/
        int a=4;
        int b=5;
        System.out.println(add(a,b));

    }
/*    static void hello(String text, int age) {
        System.out.println("Hello "+text+". You are "+age+" years old.");
    }
*/    
    static int add(int x, int y) {
        return x + y;
    }
}