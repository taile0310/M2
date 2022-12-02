package ss17.bai_tap.service;

import ss17.bai_tap.exception.ExistedProductException;
import ss17.bai_tap.model.Product;

import javax.swing.event.ListDataEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProduct {
    private final String PATH_FILE = "src/ss17/bai_tap/product.csv";

    private final IBinary binary = new ProductIBinary();


    @Override
    public void add(Product product) throws IOException, ClassNotFoundException, ExistedProductException {
        List<Product> productList = this.binary.readProduct(PATH_FILE);

        for (Product p : productList){
            if (p.getId() == product.getId()){
                throw new ExistedProductException();
            }
        }
        productList.add(product);
        this.binary.writeProduct(PATH_FILE, productList);
    }

    @Override
    public void search(int id) throws IOException, ClassNotFoundException {
        List<Product> productList = this.binary.readProduct(PATH_FILE);
//        boolean check = true;
        for (Product p : productList) {
//            check = false;
            if (p.getId() == id) {
                System.out.println(p);
//                check = true;
                return;
            }
        }
//        if (!check){
        System.out.println("không tìm thấy");
//        }
    }

    @Override
    public void display() throws IOException, ClassNotFoundException {
        List<Product> productList = this.binary.readProduct(PATH_FILE);
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
