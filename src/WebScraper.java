import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class WebScraper {



    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void wordcount(final String wut) {
        String str1 = wut;
        String[] wordArray = str1.trim().split("\\s+");
        int wordCount = wordArray.length;

        System.out.println(Arrays.deepToString(wordArray));
        System.out.println("Word count is = " + wordCount);
    }

    public static void main(String[] args) {
        wordcount(urlToString("https://www.bls.gov/tus/charts/chart9.txt"));
        System.out.println("Yus");
    }

}
