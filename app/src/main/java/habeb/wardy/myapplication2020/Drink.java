package habeb.wardy.myapplication2020;

public class Drink
{


    private String lemon;
    private String orange;
    private String apple;

    public Drink()
    {

    }



    public String getLemon() {
        return lemon;
    }

    public void setLemon(String lemon) {
        this.lemon = lemon;
    }

    public String getOrange() {
        return orange;
    }

    public void setOrange(String orange) {
        this.orange = orange;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "lemon='" + lemon + '\'' +
                ", orange='" + orange + '\'' +
                ", apple='" + apple + '\'' +
                '}';
    }


}
