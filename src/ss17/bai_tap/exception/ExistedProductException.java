package ss17.bai_tap.exception;

public class ExistedProductException extends Exception {
    public ExistedProductException(){
        super("đã tồn tại");
    }

}
