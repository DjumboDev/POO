package me.djumbodev.poo;

public class HomeAddress {
    protected final String streetName;
    protected final String phoneNumber;
    protected final String email;
    protected final String city;
    protected final String country;

    public HomeAddress(String streetName, String PhoneNumber, String email, String ville, String country){
    IO.println("Adresse Personne");

    this.streetName = streetName;
    this.email = email;
    this.phoneNumber = PhoneNumber;
    this.country = country;
    this.city = ville;
    }

    public String getStreetName(){
        return this.streetName;
        }
    public String getEmail(){
        return this.email;
        }
    public String getPhoneNumber(){
        return this.phoneNumber;
        }
    public String getCountry(){
        return this.country;
        }
    public String getCity(){
        return this.city;
        }
}
