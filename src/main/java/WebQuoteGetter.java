import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebQuoteGetter implements QuoteGetter {

    @Override
    public Quote getQuote() {
        URL url = null;
        try {
            url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder json = new StringBuilder();
            String inputLine = in.readLine();
            while(inputLine != null) {
                json.append(inputLine);
                inputLine = in.readLine();
            }
            in.close();
            Gson gson = new Gson();
            String[] parsedJson = gson.fromJson(json.toString(), String[].class);
            Quote ronQuote = new Quote(parsedJson[0]);
            return ronQuote;

        } catch (IOException e) {
            System.out.println("internet is down");
            System.out.println(e);
        }
        return null;
    }
}
