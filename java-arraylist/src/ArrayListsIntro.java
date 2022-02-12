import java.util.*;

public class ArrayListsIntro {
    public static void main(String[] args) {
        // For primitive data types, appropriate wrapper classes should be used.
        // Example: ArrayList<Integer> to store int values.
        // String is a referenced data type.
        ArrayList<String> food = new ArrayList<String>();
        food.add("Nachos");
        food.add("Pizza");
        food.add("Pasta");
        food.add("Ice Cream");
        food.set(0, "Fries");
        food.remove(2);
        
        // for (int index = 0; index < food.size(); index++) {
        //     System.out.println(food.get(index));
        // }

        // food.clear();
        
        for (int index = 0; index < food.size(); index++) {
            System.out.println(food.get(index));
        }
    }
}
