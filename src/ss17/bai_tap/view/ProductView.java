package ss17.bai_tap.view;

import ss17.bai_tap.controller.ProductController;

import ss17.bai_tap.model.Product;

import java.util.Scanner;

public class ProductView {

    private ProductController productController = new ProductController();

    public void displayProduct(){
        do {
            System.out.println("menu");
            System.out.println("1. thêm sản phẩm");
            System.out.println("2. tìm kiếm sản phẩn");
            System.out.println("3. hiển thị sản phẩm");
            Scanner scanner = new Scanner(System.in);
            System.out.println("bạn hãy nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    this.addProduct();
                    break;

                case 2:
                    System.out.println("input id: ");
                    int numĨd = Integer.parseInt(scanner.nextLine());
                    this.productController.searchProduct(numĨd);
                    break;
                case 3:
                    this.productController.displayProduct();
                    break;
            }

        }while (true);


    }
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input company name: ");
        String companyName = scanner.nextLine();
        System.out.println("input prices: ");
        Double prices = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, companyName, prices);
        productController.addProduct(product);
    }




}
