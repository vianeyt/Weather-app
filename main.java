import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        URL urlObj = new URL("https://restcountries.com/v3.1/name/Italy");
        HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
        connection.setRequestMethod("GET"); // youre requesting information from the site think of HTTP methods

        int responseCode = connection.getResponseCode(); // again think of 200, 404 and their meanings

        if (responseCode == HttpsURLConnection.HTTP_OK) {
            StringBuilder sb = new StringBuilder();
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            System.out.println(sb);
            ObjectMapper ObjectMapper = new ObjectMapper();
        } else {
            System.out.println("Failure");
        }
    }
}
