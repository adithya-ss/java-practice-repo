enum PlanetData {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);
    
    int planetId;
    PlanetData(int planetID) {
        this.planetId = planetID;
    }
}
public class ParamEnums {
    public static void main(String[] args) {
        PlanetData planetA = PlanetData.VENUS;
        habitability(planetA);
        PlanetData planetB = PlanetData.EARTH;
        habitability(planetB);
        PlanetData planetC = PlanetData.MARS;
        habitability(planetC);
    }

    static void habitability(PlanetData planetName) {
        switch (planetName) {
            case EARTH:
                System.out.println("This planet is habitable!");
                System.out.println("Planet ID: " + planetName.planetId);
                break;
        
            default:
                System.out.println("This planet is not habitable yet.");
                System.out.println("Planet ID: " + planetName.planetId);
                break;
        }
    }
}
