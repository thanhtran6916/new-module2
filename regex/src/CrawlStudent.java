import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlStudent {
    public static ArrayList<Student> students = new ArrayList<>();
    static String regexName = "center\\\">([a-zA-Z][a-zA-Z].+)<\\/td>";
    static String regexClass = "center\\\">([a-zA-Z]\\d{4}.+)<\\/td>";
    static String regexPoint = "center\\\">\\d{3,}<\\/td>";
    public static void main(String[] args) {
        String content = content();
        ArrayList<String> name = crawl(regexName, content);
        ArrayList<String> classStudent = crawl(regexClass, content);
        ArrayList<String> points = crawl(regexPoint, content);
        System.out.println(name.size());
        System.out.println(classStudent.size());
        System.out.println(points.size());
    }

    public static ArrayList<String> crawl(String regex, String content) {
        ArrayList<String> data = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String b = matcher.group();
            String c = b.replaceAll("center\">", "");
            String a = c.replaceAll("<\\/td>", "");
            data.add(a);
        }
        return data;
    }
    public static String content() {
        URL url = null;
        String content = null;
        try {
            url = new URL("https://andy.codegym.vn/center/1/leaderboard");
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(inputStreamReader);
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            content.replaceAll("\n", "");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
