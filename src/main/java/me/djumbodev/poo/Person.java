package me.djumbodev.poo;

public class Person {
    protected final String name;
    protected final int age;
    protected final int birthDay;
    protected final Month birthMonth;
    protected final int birthYear;
    protected final int id;
    protected final String gender;
    protected final String status;
    protected final DifferentNationality nationality;

    public Person(String name, int age, int birthDay, Month birthMonth, int birthYear, int id, String gender, String status, DifferentNationality nationality){

        if (birthDay > 31){
            throw new IllegalArgumentException("Vous ne pouvez pas etre au dessus de 31 jours dans un mois.");
        }
        if (birthMonth.equalsIgnoreCase(birthMonth)){
            IO.println("");
        } else {
            throw new IllegalArgumentException("Vous ne pouvez que choisir la liste des mois disponible.");
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
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.id = id;
        this.gender = gender;
        this.status = status;
        this.nationality = nationality;

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

    public Month getBirthMonth(){
        return this.birthMonth;
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
    public DifferentNationality getNationality(){
        return this.nationality;
    }

}

