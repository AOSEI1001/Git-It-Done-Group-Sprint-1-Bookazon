public class ZipCode{
    private final String value;

    public ZipCode(String value){

        if(!value.matches("\\d{5}")){
            throw new IllegalArgumentException("Invalid zip code");
        }
        
        this.value = value;
    }
}