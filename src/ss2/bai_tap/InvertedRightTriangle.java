package ss2.bai_tap;

public class InvertedRightTriangle {
    public static void main(String[] args) {
//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
        for (int i = 5; i >= 1; i--) {
//            Vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
