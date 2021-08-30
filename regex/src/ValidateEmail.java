import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        String[] stringBuilder = new String[3];
        stringBuilder[0] = ("abc@hotmail.com");
        stringBuilder[1] = ("ab@yahoo.com");
        stringBuilder[2] = ("abc@hotmail.com");
        String regex = "^[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < stringBuilder.length; i++) {
            matcher = pattern.matcher(stringBuilder[i]);
            if (matcher.find()) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
