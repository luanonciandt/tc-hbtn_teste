import java.util.regex.Pattern;

public class Pessoa {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("@+");

    public static boolean emailValid(String email) {
        return EMAIL_PATTERN.matcher(email).find() && email.length() <= 50;
    }

}
