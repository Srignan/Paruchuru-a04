package baseline;

public class Product {
    private String Name = null;
    private double price = 0 ;
    private int quantity = 0;

    public String getName() {
        return null;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPRICE() {
        return price;
    }

    public void setPRICE(double price) {
        this.price = price;
    }

    public int getQUANTITY() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", PRICE=" + price +
                ", QUANTITY=" + quantity +
                '}';
    }

    public Product(String name, double price, int quantity) {
        Name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
