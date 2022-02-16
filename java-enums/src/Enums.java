enum Planets {
    MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE,PLUTO;
}

public class Enums {
    public static void main(String[] args) {
        Planets planetA = Planets.VENUS;
        habitability(planetA);
        Planets planetB = Planets.EARTH;
        habitability(planetB);
        Planets planetC = Planets.MARS;
        habitability(planetC);
    }

    static void habitability(Planets planetName) {
        switch (planetName) {
            case EARTH:
                System.out.println("This planet is habitable!");
                break;
        
            default:
                System.out.println("This planet is not habitable yet.");
                break;
        }
    }
}
