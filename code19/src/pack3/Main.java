package pack3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "ali";
//        person.family = "abadi";
//        person.birthdate = LocalDate.now();

        person.setName("ali");
        person.setFamily("abadi");
        person.setBirthdate(LocalDate.now());
        person.info();
        String name = person.getName();
        System.out.println(name);
    }
}
