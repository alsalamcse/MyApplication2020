package habeb.wardy.myapplication2020;

public class MainMeals
{



    public String getMeet() {
        return meet;
    }

    public void setMeet(String meet) {
        this.meet = meet;
    }

    public String getChickens() {
        return chickens;
    }

    public void setChickens(String chickens) {
        this.chickens = chickens;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }
    @Override
    public String toString() {
        return "MainMeals{" +
                "meet='" + meet + '\'' +
                ", chickens='" + chickens + '\'' +
                ", fish='" + fish + '\'' +
                '}';
    }

    private String meet;
    private String chickens;
    private String fish;



}
