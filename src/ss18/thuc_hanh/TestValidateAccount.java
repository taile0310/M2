package ss18.thuc_hanh;

public class TestValidateAccount {
    private static ValidateAcount validateAcount;
    private static final String[] validAccount = new String[]{"zx_ca1cv","asdaf_122"};
    private static final String[] inValidAccount = new String[]{"_Aa1cv","a1_a"};

    public static void main(String[] args) {
        validateAcount = new ValidateAcount();
        for (String account : validAccount) {
            boolean isValid = validateAcount.validate(account);
            System.out.println(account + " " + isValid);
        }
        for (String acconut : inValidAccount) {
            boolean isInValid = validateAcount.validate(acconut);
            System.out.println(acconut + " " + isInValid);
        }
    }
}
