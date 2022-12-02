package ss17.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    /*private: dùng để kiểm soát người dùng nhập xuất dữ liệu */
    private int id;
    private String name;
    private String companyName;
    private Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int id, String name, String companyName, Double price) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", price=" + price +
                '}';
    }
}
