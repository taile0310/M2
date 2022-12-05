package CaseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String SERVICECODE_REGEX = "^[SV]+[VL|RO]+.+[0-9]{4}$";
    private static final String SERVICENAME_REGEX = "^[A-Z]{1}+[a-z]";
    private static final String AREA_REGEX = "^[0-9]$";
    private static final String COST_REGEX = "^[0-9]$";
    private static final String NUMPEOPLE_REGEX = "^[0-9]$";
    private static final String NUMFLOOR_REGEX = "^[0-9]$";
    private static final String RENTALTYPE_REGEX = "^[A-Z]{1}+[a-z]$";
    public static boolean validate(String regex){
        pattern = Pattern.compile(SERVICECODE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();

    }

    public static void main(String[] args) {
        final String[] valid = new String[]{"SVVL-1234","SVRO-4759","ROSV-4568","AAVL-1254"};
        for (String name : valid) {
            if (validate(name)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }
    }

}
