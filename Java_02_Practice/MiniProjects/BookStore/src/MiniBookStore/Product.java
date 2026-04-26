package MiniBookStore;
//shared specifications for all products.
public class Product {

    //-------shared fields - variables---------
    private static int counter = 0;
    private int id;
    private String name;
    private double price;
    private int stock;

    //--------Constructors----------
    public Product(String name, double price, int stock) {
        counter++;
        this.id = counter;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //--------Getter---------------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    //--------Setter----------

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
