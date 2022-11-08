package ss2.bai_tap;

public class PrintRectangle {
    public static void main(String[] args) {
//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
        for (int i = 1; i <= 3; i++) {
//            Vòng lặp trong hiển thị số cột (chiều rộng)
            for (int j = 1; j <= 5; j++) {
                System.out.print("*  ");
            }
            System.out.println("");

        }
    }
}
