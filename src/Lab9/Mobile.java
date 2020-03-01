package Lab9;

public class Mobile {
    //
    private int ID;
    private String Brabd;
    private String gen;
    private double Price;
    private String Version;

    public Mobile(int ID, String brabd, String gen, double price, String version) {
        this.ID = ID;
        Brabd = brabd;
        this.gen = gen;
        Price = price;
        Version = version;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ID=" + ID +
                ", Brabd='" + Brabd + '\'' +
                ", gen='" + gen + '\'' +
                ", Price=" + Price +
                ", Version='" + Version + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrabd() {
        return Brabd;
    }

    public void setBrabd(String brabd) {
        Brabd = brabd;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}
