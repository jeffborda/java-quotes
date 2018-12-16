import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testConstructor() {
        Quote q1 = new Quote("Quote text.", "Author Name");
        assertEquals("Quote text.", q1.text);
        assertEquals("Author Name", q1.author);
    }


}