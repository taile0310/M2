package ss17.bai_tap.service;

import ss17.bai_tap.exception.ExistedProductException;
import ss17.bai_tap.model.Product;
import sun.net.www.content.text.Generic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProduct {
    private final List<Product> products = new ArrayList<>();

    private final String PATH_FILE = "src/ss17/bai_tap/product.csv";


    @Override
    public void add(Product product){
            products.add(product);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                assert objectOutputStream != null;
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void search(int id) {
//        boolean check = true;
        for (Product p : products) {
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
    public void display() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
