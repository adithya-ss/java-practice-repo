import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Food food;

        System.out.println("Welcome to Java Cafe.");
        System.out.println("Please place your order.");
        System.out.println("1. Pasta; 2. Noodle; 3. Pizza");

        int choice = scan.nextInt();
        
        if (choice == 1) {
            food = new Pasta();
        } else if (choice == 2) {
            food = new Noodle();
        } else if (choice == 3) {
            food = new Pizza();
        } else {
            food = new Food();
        }
        food.pricing();

        scan.close();
    }
}
