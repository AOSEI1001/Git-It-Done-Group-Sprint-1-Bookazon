public class Country {

    private final String countryCode;

    public Country(String countryCode){
        this.countryCode = countryCode.toUpperCase();

    }

    public String getCountryCode(){
        return countryCode;
    }
    
}
