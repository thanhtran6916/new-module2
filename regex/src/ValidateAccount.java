import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static void main(String[] args) {
        String regex = "^[_a-z0-9]{6,}$";

        LinkedList<String> arrayList = new LinkedList<>();
        arrayList.add("123abc_");
        arrayList.add("_abc123");
        arrayList.add("_______");
        arrayList.add("123456");
        arrayList.add(".@");
        arrayList.add("12345");
        arrayList.add("1234_");
        arrayList.add("abcde ");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        for (String value : arrayList) {
            matcher = pattern.matcher(value);
            if (matcher.find()) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
