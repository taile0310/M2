package CaseStudy.model;

public class Promotion extends Person {
    private String voucher;

    public Promotion() {
    }

    public Promotion(String voucher) {
        this.voucher = voucher;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "voucher='" + voucher + '\'' + super.toString() +
                '}';
    }
}
