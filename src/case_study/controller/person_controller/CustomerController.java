package case_study.controller.person_controller;

import case_study.model.person.Customer;
import case_study.service.Impl.CustomerServiceImpl;
import case_study.service.ICustomer;

import java.io.IOException;

public class CustomerController{
    private final ICustomer iCustomer = new CustomerServiceImpl();

        public void displayCustomer(Customer customer){
            try {
                this.iCustomer.display(customer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public void addCustomer(Customer customer){
            try {
                this.iCustomer.add(customer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public void deleteCustomer(Customer customer){
            try {
                this.iCustomer.delete(customer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public void editCustomer(Customer customer){
            try {
                this.iCustomer.edit(customer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


}
