import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.jar.Pack200;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://andy.codegym.vn/center/1/leaderboard");
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(inputStreamReader);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content.replaceAll("\n", "");
            String regex = "center\\\">[^0-9]{2}.*<\\/td>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
