public class Mercedes implements Car, Origins {
    public void drive() {
        System.out.println("Merc's engine started.");
    }
    public String countryOfOrigin(){
        return "Manufactured and assembled in Germany.";
    }
}
