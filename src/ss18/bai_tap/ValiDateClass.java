package ss18.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiDateClass {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_REGEX = "^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]$";
    public static boolean  valiDateClass(String regex){
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {

        final String[] valid = new String[]{"C1234G","A1235I","G1234G","a1235I"};

        for (String nameClass : valid) {
            if(valiDateClass(nameClass)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
