public class Numberphone {

    protected final int number;
    protected final String type;
    protected final int countryCode;

    public Numberphone(int number, String type, int countryCode) {
        this.number = number;
        this.type = type;
        this.countryCode = countryCode;
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