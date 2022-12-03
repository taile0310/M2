package CaseStudy.model;

public class Customer extends Person {
    private int customerCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int customerCode, String typeOfGuest, String address) {
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
