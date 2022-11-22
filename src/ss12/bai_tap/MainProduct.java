package ss12.bai_tap;

import java.util.ArrayList;

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product(1,"hoa", 2000.0);
        Product product2 = new Product(2,"bong", 200.0);
        Product product3 = new Product(3,"xe", 200000.0);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        productManager.display();
        productManager.fixProduct(2);
        productManager.searchProduct("nha");
        productManager.sortProductAscending();
        productManager.sortProductDescending();
        productManager.removeProduct(1);
    }
}
