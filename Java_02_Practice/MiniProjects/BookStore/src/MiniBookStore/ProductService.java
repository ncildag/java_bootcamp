package MiniBookStore;
// All process and services of products. These are must rules for all Service classes.

public interface ProductService {

    void processMenu();
    void listProducts();
    void addProduct();
    void removeProduct();
    void filterProduct(String filter);

}
