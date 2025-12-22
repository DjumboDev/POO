package me.djumbodev.poo.Personnes;

public class Personne {
    protected final String name;
    protected final int age;
    protected int birthDay;
    protected final int birthYear;
    protected final int id;
    protected final String gender;
    protected final String status;

    public Personne(String name, int age, int birthDay, int birthYear, int id, String gender, String status){

        if (birthDay > 31){
            throw new IllegalArgumentException("Vous ne pouvez pas etre au dessus de 31 jours dans un mois.");
        }
        if (birthYear < 1950){
            throw new IllegalArgumentException("Vous ne pouvez pas être née en 1950 convention non respecté.");
        }
        if (gender.equalsIgnoreCase("homme") || gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("femme") || gender.equalsIgnoreCase("female")){
            IO.println("");
        } else {
            throw new IllegalArgumentException("Error");

        }

        IO.println("Constructeurs de Personne");
        this.age = age;
        this.name = name;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.id = id;
        this.gender = gender;
        this.status = status;

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getBirthDay(){
        return this.birthDay;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public int getId(){
        return this.id;
    }

    public String getGender(){
        return this.gender; //homme ou femme
    }

    public String getStatus(){
        return this.status;
    }

}

