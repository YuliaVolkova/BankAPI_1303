package data;

public enum CountryCode {

    USD("USD"),
    AUD("AUD"),
    CAD("CAD"),
    CNY ("CNY");

    private String countryCode;
    CountryCode(String countryCode){
        this.countryCode=countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
