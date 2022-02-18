import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {      
        Scanner scanNum = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numA = scanNum.nextInt();
            System.out.print("Enter denominator: ");
            int numB = scanNum.nextInt();
            int result = numA / numB;
            System.out.println("Result: " + result);
        } catch (ArithmeticException arEx) {
            System.err.println(arEx);
            System.out.println("A number can not be divided by zero.");
        } catch (InputMismatchException inEx) {
            System.err.println(inEx);
            System.out.println("Denominator is not in the correct format.");
        } catch (Exception ex) {
            System.err.println(ex);
            System.out.println("Whoops! Something went wrong.");
        } finally {
            System.out.println("Execution completed.");
            scanNum.close();
        }
    }
}
