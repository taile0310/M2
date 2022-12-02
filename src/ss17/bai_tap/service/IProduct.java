package ss17.bai_tap.service;

import ss17.bai_tap.exception.ExistedProductException;
import ss17.bai_tap.model.Product;

import java.io.IOException;

public interface IProduct {
     void add(Product product) throws IOException, ClassNotFoundException, ExistedProductException;
     void search(int id) throws IOException, ClassNotFoundException;
     void display() throws IOException, ClassNotFoundException;
}