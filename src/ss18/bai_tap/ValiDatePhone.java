package ss18.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiDatePhone {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String PHONE_REGEX = "^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$";
    public static boolean valiDatePhone(String regex){
        pattern = Pattern.compile(PHONE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phone = new String[]{"(84)-(0329583800)","(a4)-(0123456789)","(84)-(06789)","(5k)-(0123456789)"};
        for (String numPhone : phone) {
            if (valiDatePhone(numPhone)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
