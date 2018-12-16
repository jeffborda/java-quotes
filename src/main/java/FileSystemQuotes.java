import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSystemQuotes {
    public static Quote[] getQuotes(String path) throws IOException {

        BufferedReader br = Files.newBufferedReader(Paths.get(path));
        StringBuilder json = new StringBuilder();
        String inputLine = br.readLine();
        while(inputLine != null) {
            json.append(inputLine);
            inputLine = br.readLine();
        }
        Gson gson = new Gson();
        return gson.fromJson(json.toString(), Quote[].class);
    }
}
