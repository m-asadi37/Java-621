import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        String s1 = scan.next();
        System.out.println(i1 + i2);
        System.out.println(s1);
        System.out.println(scan.hasNextInt());
    }

    public static void main2(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i1 = scan.nextInt();
        scan.nextLine();
        int i2 = scan.nextInt();
        scan.nextLine();
        String s1 = scan.nextLine();

        System.out.println(i1 + i2);
        System.out.println(s1);
    }

    public static void main3(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int i1 = scan.nextInt();

        int i2 = scan.nextInt();

        String s1 = scan.next();

        System.out.println(i1 + i2);
        System.out.println(s1);
    }

    public static void main4(String[] args) {
        int a = 7, b = 19;
        int c = b / a;
        double d = 19.0 / 7.0;
        System.out.println(a + b);
        System.out.println(10.0 / a);
        System.out.println(b % a);

        int i1 = 10;
        int i2 = i1++;
        //i2 = i1
        //i1 = i1 + 1
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        i1 = 10;
        i2 = i1--;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        i1 = 10;
        i2 = ++i1;
        //i1 = i1 + 1
        //i2 = i1
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        i1 = 10;
        i2 = --i1;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        System.out.println("*****");

        i1 = 7;
        i1 += 3;
        //i1 = i1 + 3
        System.out.println(i1);

        i1 /= 2;
        System.out.println(i1);

        i1 %= 2;
        System.out.println(i1);

        System.out.println(i1 >= i2);
        System.out.println(1 == 1);
        System.out.println(1 != 2);

        System.out.println("*****");

        boolean A = false;
        boolean B = false;
        boolean AandB = A && B;
        System.out.println(AandB);
        System.out.println(A || B);

        System.out.println(8 & 7);
        System.out.println(1 | 2);
        System.out.println(1 >> 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (i < 0 && i % 2 == 0)
            System.out.println("i less than 0 and even");
        else if (i < 10) {
            System.out.println("i less than 10");
            System.out.println("*******");
        } else {
            System.out.println("i is too large!!!");
        }

        switch (i) {

            case 1: {
                System.out.println("one");
            }
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
                System.out.println("THREE");
        }

    }

}
