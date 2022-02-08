public class Team {

    private String name;
    private String sport;
    private String league;
    private int year;
    
    Team(String name, String sport, String league, int year){
        this.setName(name);
        this.setSport(sport);
        this.setLeague(league);
        this.setYear(year);
    }

    public String getName(){
        return name;
    }
    public String getSport(){
        return sport;
    }
    public String getLeague(){
        return league;
    }
    public int getYear(){
        return year;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSport(String sport){
        this.sport = sport;
    }
    public void setLeague(String league){
        this.league = league;
    }
    public void setYear(int year){
        this.year = year;
    }

}
