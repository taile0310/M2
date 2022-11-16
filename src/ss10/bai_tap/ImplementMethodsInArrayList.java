package ss10.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class ImplementMethodsInArrayList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println("Arrray is: " + myList);
// Xóa phần tử trong mảng tại một vị trí
        myList.remove(0);
        myList.remove(3);
        System.out.println("element remove is: " + myList);

// Xóa tất cả các phần tử trong mảng
//        myList.clear();
//        System.out.println("clear array: " + myList);

// Lấy ra độ dài của mảng
        System.out.println("array length: " + myList.size());

// Lấy ra phần tử của mảng tại một vị trí
        System.out.println("get the element at a position: " + myList.get(2));

// Lấy ra vị trí của một phần tử trong mảng
        System.out.println(myList.indexOf(3));
    }
}

