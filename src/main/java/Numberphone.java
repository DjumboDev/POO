public class Numberphone {

    protected final int number;
    protected final String type;
    protected final int countryCode;

    public Numberphone(int number, String type, int countryCode) {
        this.number = number; // numéro de téléphone 
        this.type = type; // Mobile, Home, Work
        this.countryCode = countryCode; // + 33
    }

    public int getNumber(){
        return this.number;
    }

    public String getType(){
        return this.type;
    }

    public int getCountryCode(){
        return this.countryCode;
    }
}