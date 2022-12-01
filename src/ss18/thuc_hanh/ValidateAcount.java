package ss18.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAcount {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[a-za_z0-9]{6,}$";

    public ValidateAcount() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
