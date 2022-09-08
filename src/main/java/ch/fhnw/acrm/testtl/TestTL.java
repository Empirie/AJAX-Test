package ch.fhnw.acrm.testtl;




public class TestTL {

    private String name;
    private double price;
    private double palletSize;

    public TestTL() {
    }

    public TestTL(String name, double price, double palletSize) {
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPalletSize() {
        return palletSize;
    }

    public void setPalletSize(double palletSize) {
        this.palletSize = palletSize;
    }

    @Override
    public String toString() {
        return "TestTL{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", palletSize=" + palletSize +
                '}';
    }
}
