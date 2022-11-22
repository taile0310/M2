package ss12.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Product> list = new ArrayList<>();
    public void addProduct(Product product){
        list.add(product);

    }
    boolean flag = true;

    public void removeProduct(int id){

        for (Product product : list) {
            if (product.getId() == id){
                list.remove(product);
                System.out.println("tất cả sau khi xóa");
                flag = true;
                break;
            }else {
                flag = false;
            }
        }if (!flag){
            System.out.println("Không tìm thấy sản phâm để xóa");
        }

    }

    public void searchProduct(String name){
        for (Product product : list){
            if (product.getName().equals(name)){
                System.out.println("tìm thành công sản phâm: " + product.toString());
                display();
                flag = true;
            }else {
                flag = false;
            }
//            if (!flag){
//                System.out.println("không tìm thấy sản phẩm");
//            }
        }

    }

    public void fixProduct(int id){
//        dùng vòng lặp duyệt ptu của list, nếu có id nào trùng thì sửa ptu đó
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.println("mời bạn sửa");
                int numId = Integer.parseInt(scanner.nextLine());
                System.out.println(product.setId(numId));

            }

        }

    }
    public void display(){
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void sortProductAscending(){
        ComparatorAscending comparatorAscending = new ComparatorAscending();
        Collections.sort(list, comparatorAscending);
        System.out.println("sản phẩm sau khi tăng dần");
        display();

    }

    public void sortProductDescending(){
        sortProductAscending();
        Collections.reverse(list);
        System.out.println("sản phẩm sau khi giảm");
        display();
    }
}
