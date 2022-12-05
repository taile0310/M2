package CaseStudy.model;

public class Promotion extends Employee {
    private String voucher;

    public Promotion() {
    }

    public Promotion(int id, String name, String dateOfBirth, String gender, int identityCard, int phone, String mail, String level, String location, Double wage, String voucher) {
        super(id, name, dateOfBirth, gender, identityCard, phone, mail, level, location, wage);
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
