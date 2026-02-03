package pack3;

import java.time.LocalDate;

public class Person {

    public Person(String name, String family, LocalDate birthdate) {
        this.name = name;
        this.family = family;
        this.birthdate = birthdate;
    }

    public Person() {
    }

    //ENCAPSULATION
    //1. private access for properties
    private String name;
    private String family;
    private LocalDate birthdate;

    //2. create GETTER and SETTER methods fpr each property
    //getter: return properties!
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    //setter: set value to properties!
    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setBirthdate(LocalDate birthdate){
        this.birthdate = birthdate;
    }

    void info() {
        System.out.println("Name: " + name);
        System.out.println("Family: " + family);
        System.out.println("Birthdate: " + birthdate);
    }
}
