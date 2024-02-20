package educative.complex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public static List<String> findCountry(String region, String keyword) throws IOException {
        String apiUrl = "https://jsonmock.hackerrank.com/api/countries/search?region=" + region + "&name=" + keyword + "&page=1";

        // Send an HTTP GET request to the API URL
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the JSON response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Parse the JSON response and extract country names
        List<String> countryNames = new ArrayList<>();
        // You will need to parse the JSON response and extract country names here

        // Close the connection
        connection.disconnect();

        return countryNames;
    }
}

