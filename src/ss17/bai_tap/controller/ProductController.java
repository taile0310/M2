package ss17.bai_tap.controller;

import ss17.bai_tap.exception.ExistedProductException;
import ss17.bai_tap.model.Product;
import ss17.bai_tap.service.IProduct;
import ss17.bai_tap.service.ProductServiceImpl;

import java.io.IOException;

public class ProductController {
    IProduct productService = new ProductServiceImpl();

    public void addProduct(Product product){
        try {
            this.productService.add(product);
        } catch (IOException | ExistedProductException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void searchProduct(int id){
        try {
            this.productService.search(id);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayProduct(){
        try {
            this.productService.display();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
