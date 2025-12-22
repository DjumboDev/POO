package me.djumbodev.poo;

public class PhoneNumber {

    private final int number;
    private final PhoneType type;
    private final PhoneCountry country;

    public PhoneNumber(int number, PhoneType type, int countryCode) {
        this.number = number;
        this.type = type;
        this.country = PhoneCountry.getFirstByCountryCode(countryCode);
    }

    public int getNumber() {
        return this.number;
    }

    public PhoneType getType() {
        return this.type;
    }

    public PhoneCountry getCountry() {
        return this.country;
    }
}