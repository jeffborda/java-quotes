import java.io.FileWriter;
import java.io.IOException;

public class FileSystemQuoteGetter implements QuoteGetter {

    protected Quote[] quotes;
    private String quotesPath;

    public FileSystemQuoteGetter(String path) {
        this.quotesPath = path;
    }

    @Override
    public Quote getQuote() {
        if(quotes == null) {
            readQuotes();
        }
        return getRandomQuote();
    }

    private Quote getRandomQuote(){
        return quotes[(int)(Math.random() * quotes.length)];
    }

    private void readQuotes() {

    }
}
