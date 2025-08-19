package prof.homeworks._08_19_Lesson20.service;

import java.util.Map;

public class CountryCodeManager {
    private final  CountryCodeService loader;
    private final Map<String, String> countryCodes;

    public CountryCodeManager() {
        this.loader = new CountryCodeService();
        this.countryCodes = loader.loadCountryCodes();
    }
    public String getCountryName(String code){
        return countryCodes.get(code);
    }

}

