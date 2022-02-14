public class Hero extends Person {
    String heroPower;
    Hero(String heroName, int heroAge, String heroPower){
        super(heroName,heroAge);
        this.heroPower = heroPower;
    }
    public String toString() {
        return super.toString() + "Super-power: " + this.heroPower + "\n";
    }    
}
