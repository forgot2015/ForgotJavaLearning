package schema.creation.abstractFactory.bean;

/**
 * Created by forgot on 2017/6/18.
 */
public class Product {
    private String priductName;
    private double price;

    public Product(String priductName, double price) {
        this.priductName = priductName;
        this.price = price;
    }

    public String getPriductName() {
        return priductName;
    }

    public void setPriductName(String priductName) {
        this.priductName = priductName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "priductName='" + priductName + '\'' +
                ", price=" + price +
                '}';
    }
}
