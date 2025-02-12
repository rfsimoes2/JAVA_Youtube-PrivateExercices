public class Main {
    public static void main(String[] args) {

        //method = a block of code that is executed whenever it is called upon

        String name = "Ricardo";
        int age = 43;

        hello(name,age);
        hello("Andre",25);
        System.out.println("Both ages sumed is "+sumAge(age,25));

    }
        static void hello(String n, int a){
            System.out.println("Hello " +n);
            System.out.println("You have "+ a);
        }
        static int sumAge(int a, int b){
        return a+b;
        };
}