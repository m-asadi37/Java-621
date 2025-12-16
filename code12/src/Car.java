public class Car {

    Car() {
        System.out.println("call default constructor...");
    }

    Car(String plate, String color) {
        System.out.println("call constructor with arguments...");
        this.plate = plate;
        this.color = color;
    }

//    Car(String model111, String color1111){
//        this.model = model;
//        this.color = color;
//    }

    String plate;
    String color;
    String model;
}
