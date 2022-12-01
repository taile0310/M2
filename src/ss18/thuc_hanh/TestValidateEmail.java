package ss18.thuc_hanh;

public class TestValidateEmail {
    private static ValidateEmail validateEmail;
    public static final String[] valiEmail = new String[]{"tai1@gmail.com", "tai@yahoo.com", "tai3@hotmail.com"};
    public static final String[] invaliEmail = new String[]{"@gmail.com", "ab@gmail.com", "#a@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
//        for (int i = 0; i < valiEmail.length; i++) {
//            boolean isVali = validateEmail.validate(Arrays.toString(valiEmail));
//            System.out.println(isVali);
//        }
//        for (int i = 0; i < invaliEmail.length; i++) {
//            boolean isInvali = validateEmail.validate(Arrays.toString(invaliEmail));
//            System.out.println(isInvali);
//        }
        for (String email : valiEmail) { boolean isVali = validateEmail.validate(email);
            System.out.println(email + " " + isVali);

        }
        for (String email : invaliEmail) { boolean isInvali = validateEmail.validate(email);
            System.out.println(email + " " + isInvali);

        }

    }

}
