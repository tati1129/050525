package prof.homeworks._08_19_Lesson20.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountryCodeService {

    private final String FILE_PATH = "src/main/java/prof/homeworks/_08_19_Lesson20/sources/country_codes.csv";

    public Map<String, String> loadCountryCodes() {
        Map<String, String> countryCodes = new HashMap<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    countryCodes.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryCodes;
    }
}
