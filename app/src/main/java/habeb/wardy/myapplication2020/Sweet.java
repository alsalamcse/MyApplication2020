package habeb.wardy.myapplication2020;

public class Sweet
{


    public String getIceCream() {
        return iceCream;
    }

    public void setIceCream(String iceCream) {
        this.iceCream = iceCream;
    }

    public String getKonafa() {
        return konafa;
    }

    public void setKonafa(String konafa) {
        this.konafa = konafa;
    }

    public String getChoclate() {
        return choclate;
    }

    public void setChoclate(String choclate) {
        this.choclate = choclate;
    }
    @Override
    public String toString() {
        return "Sweet{" +
                "iceCream='" + iceCream + '\'' +
                ", konafa='" + konafa + '\'' +
                ", choclate='" + choclate + '\'' +
                '}';
    }

    private String iceCream;
    private String konafa;
    private String choclate;



}