package ss17.bai_tap.controller;

import ss17.bai_tap.model.Product;
import ss17.bai_tap.service.IProduct;
import ss17.bai_tap.service.ProductServiceImpl;

public class ProductController {
    IProduct productService = new ProductServiceImpl();

    public void addProduct(Product product){
        this.productService.add(product);

    }
    public void searchProduct(int id){
        this.productService.search(id);
    }
    public void displayProduct(){
        this.productService.display();
    }
}
