public class Mobile {

    String brand;
    int batteryLevel;

    Mobile(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    //default constructor
    Mobile() {
        System.out.println("Mobile constructor");
    }

    Mobile(String brand) {
        this.brand = brand;         //set property from input value
        this.batteryLevel = 100;    //set property by default value
    }
}
