
/*
 * HttpsURLConnection used to establish a connection to the weather API and make a get request
 */
/*
 * ObjectMapper: ObjectMapper is a class that provides functionality for reading and writing JSON, either to and from basic POJOs
 */
/*
 * jacksonLibrary, used to read JSON file from the GET request and extract the fields needed
 * converted the response into a java object, the ObjectMapper is a class provided by the jackson library for handling JSON data
 */
import javax.net.ssl.HttpsURLConnection;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String jsonString = getJsonString();
        ObjectMapper mapper = new ObjectMapper();
        Weather weather = mapper.readValue(jsonString, Weather.class);
        System.out.println("City: " + weather.getLocation().getName());
        System.out.println("wind: " + weather.getCurrent().getWind_mph() + " MPH");
        System.out.println("Humidity: " + weather.getCurrent().getHumidity());
        System.out.println("feels like: " + weather.getCurrent().getFeelsLike_f() + " Farenheit");
        System.out.println("feels like: " + weather.getCurrent().getFeelsLike_c() + " Celsius");
    }

    private static String getJsonString() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a valid zipcode: ");
        String zip = scanner.nextLine();
        String baseUrl = "https://api.weatherapi.com/v1/current.json?key=53e097b7f1a44eb9a3044440232801&q=";
        String newUrl = baseUrl + zip + "&aqi=yes";
        URL url = new URL(newUrl);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Failed to retrieve JSON: " + responseCode);
        }
        return new BufferedReader(new InputStreamReader(con.getInputStream()))
                .lines().collect(Collectors.joining("\n"));
    }
}
