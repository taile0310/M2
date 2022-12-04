package CaseStudy.service;

import CaseStudy.model.Customer;
import CaseStudy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomer {
    private static final List<Customer> customerList = new ArrayList<>();


    @Override
    public void display(Customer customer) {
        for (Customer cus: customerList) {
            System.out.println(cus);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        Customer deleteCus = null;
        for (Customer cus : customerList) {
            if (customer.getIdentityCard() == cus.getIdentityCard()){
                deleteCus = cus;
            }

        }
        if (deleteCus == null){
            customerList.remove(deleteCus);
        }

    }

    @Override
    public void edit(Customer customer) {
        for (Customer cus : customerList) {
            cus.setCustomerCode(customer.getCustomerCode());
            cus.setId(customer.getId());
            cus.setPhone(customer.getPhone());
        }

    }
}
