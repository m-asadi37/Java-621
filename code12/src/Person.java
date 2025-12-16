public class Person {

    //constructor...

    //default
    Person() {
        System.out.println("call constructor 1...");
    }

    Person(String personName, String personFamily) {
        System.out.println("call constructor 2...");
        name = personName;
        family = personFamily;
    }

    Person(int age) {
        System.out.println("call constructor 3...");
        //2 == 2
//        age = age;
        //this : object is in creation
        this.age = age;
    }

    //property
    String name;
    String family;
    int age;

    //method
    void info() {
        System.out.printf("Name: %s - ", name);
        System.out.printf("Family: %s - ", family);
        System.out.printf("Age: %d%n", age);
    }

}
