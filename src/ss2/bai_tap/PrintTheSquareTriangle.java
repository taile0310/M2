package ss2.bai_tap;

public class PrintTheSquareTriangle {
    public static void main(String[] args) {
//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
        for (int i = 0; i <= 5; i++) {
//            Vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
//            bottom-left corner edge
        }
    }
}
