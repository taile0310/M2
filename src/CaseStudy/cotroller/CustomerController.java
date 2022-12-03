package CaseStudy.cotroller;

import CaseStudy.model.Customer;
import CaseStudy.service.CustomerServiceImpl;
import CaseStudy.service.ICustomer;

public class CustomerController{
    ICustomer iCustomer = new CustomerServiceImpl();

        public void displayCustomer(Customer customer){
            this.iCustomer.display(customer);
        }
        public void addCustomer(Customer customer){
            this.iCustomer.add(customer);
        }
        public void deleteCustomer(Customer customer){
            this.iCustomer.delete(customer);
        }
        public void editCustomer(Customer customer){
            this.iCustomer.edit(customer);
        }


}
