import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import javax.crypto.Mac;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "(043) 2626 5555";
        strings[1] = "(043) 2626 5555";
        strings[2] = "(043) 2626 5555";
        strings[3] = "(043) 2626 5555";

        String regex = "^\\(043\\)\\s\\d{4}\\s\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String value : strings) {
            matcher = pattern.matcher(value);
            if (matcher.find()) {
                value = matcher.replaceAll("123");
            }
            System.out.println(value);
        }

        System.out.println("---------------");
        for (String value : strings) {
            if (value.matches(regex)) {
                System.out.println(value);
            }
        }


    }

}
