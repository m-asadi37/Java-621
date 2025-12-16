public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "ali";
        p1.family = "aliani";
        p1.age = 18;
        p1.info();

        Person p2 = new Person("yahya","yahyai");
        p2.info();

        Person p3 = new Person(15);
        p3.info();

        Car c1 = new Car();
        c1.plate = "1234";
        c1.color = "RED";

        Car c2 = new Car("0987", "BLUE");

    }
}
