import me.djumbodev.poo.Personnes.Adresse;
import me.djumbodev.poo.Personnes.Personne;

public class Main{
    static void main() {
        String name = "";
        int age = 0;
        int birthDay = 0;
        int birthYear = 0;
        int id = 0;
        String gender = "";
        String status = "";
        String streetName = "";
        String email = "";
        String phoneNumber = "";
        String country = "";
        String city = "";
        int number = 0;
        String type = "";
        int countryCode = 0;

        while (name.isEmpty()){
           name = IO.readln("Donnez votre nom : ");
        }

        while (age <= 0){
            age = Integer.parseInt(IO.readln("Donnez votre age : "));
        }

        while (birthDay <= 0){
            birthDay = Integer.parseInt(IO.readln("Donnez votre jour de naissance : "));
        }

        while (birthYear <= 1950){
            birthYear = Integer.parseInt(IO.readln("Donnez votre année de naissance : "));
        }

        while (id <= 0){
            id = Integer.parseInt(IO.readln("Quelle est votre ID ? "));
        }

        while (gender.isEmpty()){
            gender = IO.readln("Donnez votre sexe (homme,femme ou male ou female) : ");
        }

        while (status.isEmpty()){
            status = IO.readln("Donnez votre statut actuelle (étudiant, fonctionnaire) : ");
        }

        while (streetName.isEmpty()){
            streetName = IO.readln("Donnez votre nom de rue : ");
        }

        while (email.isEmpty()){
            email = IO.readln("Donnez votre email : ");
        }

        while (country.isEmpty()){
            country = IO.readln("Donnez le nom de votre pays : ");
        }

        while (city.isEmpty()){
             city = IO.readln("Donnez le nom de votre ville : ");
        }

        while (number <= 0){
            number = Integer.parseInt(IO.readln("Donnez votre numéro de téléphone : "));
        }

        while (type.isEmpty()){
            type = IO.readln("Donnez le type de numéro(France, Belgique etc...) : ");
        }

        while (countryCode <= 0){
            countryCode = Integer.parseInt(IO.readln("Donnez votre country code"));
        }

        Personne personne = new Personne(name, age, birthDay, birthYear, id, gender, status);
        IO.println(personne.getName());
        IO.println(personne.getAge() + " ans.");
        IO.println(personne.getBirthDay() + " est votre jour de naissance.");
        IO.println(personne.getBirthYear() + " est votre année de naissance.");
        IO.println(personne.getId() + " est votre ID.");
        IO.println(personne.getGender() + " est votre sexe.");
        IO.println(personne.getStatus() + " est votre statut actuel.");

        Adresse adresse = new Adresse(streetName, email, phoneNumber, country, city);
        IO.println(adresse.getCountry() + "est votre pays.");
        IO.println(adresse.getEmail() + "est votre email.");
        IO.println(adresse.getStreetName() + "est le nom de la rue.");
        IO.println(adresse.getPhoneNumber() + "est votre numéro de téléphone.");
        IO.println(adresse.getCity() + "est le nom de votre ville.");




    }

}
