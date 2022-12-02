package ss17.bai_tap.service;

import ss17.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductIBinary implements IBinary{


    @Override
    public List<Product> readProduct(String pathFile) throws IOException, ClassNotFoundException {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(pathFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return products;
        } catch (EOFException e) {
            System.out.println(e.getMessage());
            return products;
        }
    }

    @Override
    public void writeProduct(String pathFile, List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(products);
        fileOutputStream.close();
        objectOutputStream.close();
    }
}

