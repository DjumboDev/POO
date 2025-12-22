public class Numberphone {

    protected final int number;
    protected final PhoneType type;
    protected final int countryCode;

    public Numberphone(int number, PhoneType type, int countryCode) {
        this.number = number; // numéro de téléphone
        this.type = type; // Mobile, Home, Work
        this.countryCode = countryCode; // + 33
    }

    public int getNumber(){
        return this.number;
    }

    public PhoneType getType(){
        return this.type;
    }

    public int getCountryCode(){
        return this.countryCode;
    }
}