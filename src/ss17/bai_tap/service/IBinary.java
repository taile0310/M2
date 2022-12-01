package ss17.bai_tap.service;

import ss17.bai_tap.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IBinary {
    List<Product> readProduct(String pathFile) throws IOException, ClassNotFoundException;
    void writeProduct(String pathFile, List<Product> products) throws IOException;
}
