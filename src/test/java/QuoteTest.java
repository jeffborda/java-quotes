import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testRandomQuoteGeneratorDistribution() {
        Quote[] quotes = createQuoteArray();
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += findIndex(App.getRandomQuote(), quotes) + 1;
        }

        System.out.println(sum/1000);
    }

    private static Quote[] createQuoteArray() {
        Quote[] testArray = new Quote[10];
        testArray[0] = new Quote("Quote 1", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[1] = new Quote("Quote 2", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[2] = new Quote("Quote 3", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[3] = new Quote("Quote 4", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[4] = new Quote("Quote 5", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[5] = new Quote("Quote 6", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[6] = new Quote("Quote 7", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[7] = new Quote("Quote 8", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[8] = new Quote("Quote 9", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        testArray[9] = new Quote("Quote 10", new String[] {"tag1", "tag2"}, "author1", "10 likes");
        return testArray;
    }

    private static int findIndex(String quoteString, Quote[] quotes) {
        for (int i=0; i<quotes.length; i++) {
            if (quoteString.equals(quotes[i].getText())) {
                return i;
            }
        }
        return -1000000000;
    }
}