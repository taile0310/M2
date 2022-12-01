package ss17.bai_tap.service;

import ss17.bai_tap.exception.ExistedProductException;
import ss17.bai_tap.model.Product;

public interface IProduct {
     void add(Product product);
     void search(int id);
     void display();
}
