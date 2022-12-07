package case_study.service;

import case_study.model.person.Customer;

import java.io.IOException;

public interface ICustomer {
    void display(Customer customer) throws IOException;
    void add(Customer customer) throws IOException;
    void delete(Customer customer) throws IOException;
    void edit(Customer customer) throws IOException;
}
