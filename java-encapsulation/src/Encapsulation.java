public class Encapsulation {
    public static void main(String[] args) {
        Team chelsea = new Team("Chelsea", "Football", "EPL", 1905);
        Team rcb = new Team("Royal Challengers Bangalore", "Hockey", "ABC", 2008);
        // Compilation Error: variable name is not visible
        // System.out.println(chelsea.name);

        // Use getter methods.
        System.out.println(chelsea.getName());
        System.out.println(chelsea.getSport());
        System.out.println(chelsea.getLeague());
        System.out.println(chelsea.getYear());

        rcb.setSport("Cricket");
        rcb.setLeague("IPL");

        System.out.println(rcb.getName());
        System.out.println(rcb.getSport());
        System.out.println(rcb.getLeague());
        System.out.println(rcb.getYear());
    }
}
