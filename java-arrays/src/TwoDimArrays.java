import java.util.Scanner;

public class TwoDimArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.println("Enter the number of rows: ");
        int column = input.nextInt();
        String [][] inventory = new String[row][column];

        System.out.println("\nEnter your inventory items:");
        for (int rIndex = 0; rIndex < row; rIndex++) {
            for (int cIndex = 0; cIndex < column; cIndex++) {
                inventory[rIndex][cIndex] = input.next();
            }
        }

        System.out.println("\nEnter the item name to look for: ");
        String searchItem = input.next();

        for (int rIndex = 0; rIndex < row; rIndex++) {
            for (int cIndex = 0; cIndex < column; cIndex++) {
                if (inventory[rIndex][cIndex].equals(searchItem)) {
                    System.out.println("\n" + searchItem + " found in row " + (rIndex + 1) + " column " + (cIndex + 1));
                }
            }
            // System.out.println(); -- This needs to be present if the output needs to be printed in matrix form.
        }
        input.close();
    }
}
