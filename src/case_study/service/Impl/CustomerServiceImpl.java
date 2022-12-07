package case_study.service.Impl;

import case_study.character.Impl.CustomerCharacterImpl;
import case_study.model.person.Customer;
import case_study.service.ICustomer;

import java.io.IOException;
import java.util.List;

public class CustomerServiceImpl implements ICustomer {
    private static final String pathFile = "src/case_study/data/customer.csv";
    private final CustomerCharacterImpl customerCharacter = new CustomerCharacterImpl();


    @Override
    public void display(Customer customer) throws IOException {
        List<Customer> customers = this.customerCharacter.readFileCustomer(pathFile);
        System.out.println(customers);
    }

    @Override
    public void add(Customer customer) throws IOException {
        List<Customer> customers = this.customerCharacter.readFileCustomer(pathFile);
        customers.add(customer);
        this.customerCharacter.writeFileCustomer(pathFile, customers);
    }

    @Override
    public void delete(Customer customer) throws IOException {
        List<Customer> customers = this.customerCharacter.readFileCustomer(pathFile);
        Customer deleteCus = null;
        for (Customer cus : customers) {
            if (customer.getIdentityCard() == cus.getIdentityCard()) {
                deleteCus = cus;
            }

        }
        customers.remove(deleteCus);
        this.customerCharacter.writeFileCustomer(pathFile, customers);
    }

    @Override
    public void edit(Customer customer) throws IOException {
        List<Customer> customers = this.customerCharacter.readFileCustomer(pathFile);
        for (Customer cus : customers) {
            cus.setCustomerCode(customer.getCustomerCode());
            cus.setId(customer.getId());
            cus.setPhone(customer.getPhone());
        }
        this.customerCharacter.writeFileCustomer(pathFile, customers);

    }
}
