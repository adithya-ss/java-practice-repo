import java.util.Scanner;

public class Recursions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many times in a day do you want to be reminded to stay hydrated? - ");
        int repetitions = scan.nextInt();
        System.out.print("How many litres of water do you want to drink everyday? - ");
        int quantity = scan.nextInt();
        stayHydrated(repetitions);
        System.out.println();
        waterQuantity(0,quantity);
        scan.close();
    }
    static void stayHydrated(int num) {
        if (num > 0) {
            System.out.println("Drink water. Stay hydrated! [ " + num + " ]");
            num--;
            stayHydrated(num);
        }
    }
    static void waterQuantity(int start, int end) {
        if (start < end) {
            start++;
            System.out.println("You have consumed " + start + " litres of water today.");
            waterQuantity(start, end);
        } else {
            System.out.println("You've completed today's goal to stay hydrated.");
        }

    }
}
