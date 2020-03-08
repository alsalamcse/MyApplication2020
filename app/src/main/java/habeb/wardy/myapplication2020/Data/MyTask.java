package habeb.wardy.myapplication2020.Data;

public class MyTask
{
    private String name;
    private String much;
    private String key;
    private String owner;

    @Override
    public String toString() {
        return "MyTask{" +
                "name='" + name + '\'' +
                ", much='" + much + '\'' +
                ", key='" + key + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }



    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuch() {
        return much;
    }

    public void setMuch(String much) {
        this.much = much;
    }


}
