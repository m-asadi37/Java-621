package pack1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        double r = 10;
        double area = 2 * r * Math.PI;

        System.out.println(Math.abs(-1));
        System.out.println(Math.max(10.1, 2.4));

        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(64));
        System.out.println(Math.pow(8, 1.0 / 3.0));

        System.out.println(Math.round(3.25));
        System.out.println(Math.round(8.71));

        System.out.println(Math.floor(8.71));
        System.out.println(Math.ceil(8.71));

        double angle = Math.toRadians(90);
        System.out.println(Math.sin(angle));

        System.out.println(Math.sin(Math.PI / 6));

        System.out.println(Math.log10(1000));

        System.out.println("****");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        System.out.println("****");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10, 20));
        }
    }
}
