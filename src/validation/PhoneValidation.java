package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {

    public static boolean isValid(String phone){
        String regex = "^\\d{10}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
