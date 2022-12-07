package CaseStudy.service;

import CaseStudy.model.person.Customer;

public interface ICustomer {
    void display(Customer customer);
    void add(Customer customer);
    void delete(Customer customer);
    void edit(Customer customer);
}
