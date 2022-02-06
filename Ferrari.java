public class Ferrari implements Car, Loggable, Specs, Origins {
    public void drive() {
        System.out.println("Ferrari's engine started.");
    }
    public String countryOfOrigin(){
        return "Manufactured and assembled in Italy.";
    }
    public String message(){
        return "Ferrari is ready to drive.";
    }
    public String bhp(){
        return "750bhp.";
    }
}
