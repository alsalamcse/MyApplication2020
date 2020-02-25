package Data;

public class MainMeals
{

    private String meet;
    private String chickens;
    private String fish;

    private String owner;


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

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





}
