public class Main {

    public static void main1(String[] args) {

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

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Nokia";
        m1.batteryLevel = 100;

        Mobile m2 = new Mobile("Xiaomi", 89);

        Mobile m3 = new Mobile("iphone");
        System.out.println(m3.batteryLevel);
    }
}
