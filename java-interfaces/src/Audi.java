public class Audi implements Car, Loggable {
    public void drive() {
        System.out.println("Audi's engine started.");
    }
    public String message() {
        return "Audi is ready to drive.";
    }
}
