import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // polymorphism  = many shapes/forms
        // dynamic = after compilation (during runtime)

        // ex: A Fiat is a: Fiat, and a car, and a Vehicle, and an object

        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you want?");
        System.out.println("(1 = Dog) (2 = Cat): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Dog dog = new Dog();
            dog.speak();
        } else if (choice == 2) {
            Cat cat = new Cat();
            cat.speak();
        }else {
            System.out.println("Invalid choice");
            animal = new Animal();
            animal.speak();
        }
    }
}