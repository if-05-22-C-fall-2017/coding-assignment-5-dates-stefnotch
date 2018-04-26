import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {

    private static final String GERMAN_DATE_REGEX = "^([1-9]|[0-2][0-9]|3[01])[ .-](0?[1-9]|1[012])[ .-]((19|20)?[0-9]{2})$";
    
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile(GERMAN_DATE_REGEX);
        return p.matcher(dateString);
    }
}
