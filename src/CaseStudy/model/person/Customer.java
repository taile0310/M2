package CaseStudy.model.person;

import CaseStudy.model.Person;

public class Customer extends Person {
    private int customerCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }


    public Customer(int id, String name, String dateOfBirth, String gender, int identityCard, int phone, String mail, int customerCode, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, gender, identityCard, phone, mail);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + super.toString() +
                '}';
    }
}
