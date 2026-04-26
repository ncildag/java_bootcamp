package MiniBookStore;

public class Notebook extends Product{

    private int sheets; //number of sheets
    private String brand;

    public Notebook(String name, double price, int stock, String brand, int sheets) {
        super(name, price, stock);
        this.brand = brand;
        this.sheets = sheets;
    }

    //--------Getter - Setter ----------

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }
}
