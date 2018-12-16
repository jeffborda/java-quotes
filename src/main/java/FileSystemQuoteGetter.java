import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileSystemQuoteGetter {

    protected ArrayList<Quote> quotes;
    private String quotesPath;

    public FileSystemQuoteGetter(String path) throws IOException {

        this.quotesPath = path;

        BufferedReader br = Files.newBufferedReader(Paths.get(path));
        StringBuilder json = new StringBuilder();
        String inputLine = br.readLine();
        while(inputLine != null) {
            json.append(inputLine);
            inputLine = br.readLine();
        }
        Gson gson = new Gson();

        Type typeOf = new TypeToken<ArrayList<Quote>>(){}.getType();
        this.quotes = gson.fromJson(json.toString(), typeOf);
    }


    public Quote getRandomQuote() {
        int randomIndex = (int) (Math.random() * quotes.size());
        return quotes.get(randomIndex);
    }

    public void addFileSystemQuote(Quote newQuote) {
        quotes.add(newQuote);
    }

    public void saveQuotes() throws IOException {
        FileWriter writer = new FileWriter("assets/recentquotes.json");
        Gson gson = new Gson();
        String saveJson = gson.toJson(quotes);
        writer.write(saveJson);
        writer.close();
    }


}
