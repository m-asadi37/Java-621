import java.util.Scanner;

public class Main {


    public static void main1(String[] args) {
        System.out.println("str1...");
        System.out.println(123);

        System.out.print("java" + "\n");
        System.out.print("python" + " c++");
        System.out.println(345);

        String str = "Ali";
        System.out.printf("hello %s and %S%n", "Mohammad", str);
        System.out.printf("number is : %e\n", 12090.123312);

        System.out.printf("value in 10 characters : %10d\n", 123);

        System.out.printf("PI number in 3 floating : %.3f\n", 3.14159);

        System.out.printf("num is : %0,10d", 12300);

        System.out.println();

        System.out.printf("name : %15s", "ALI AGHA");

        System.out.println();

        System.out.printf("age is : %+3d", 12);
    }

    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);

        int i1 = inout.nextInt();
        int i2 = inout.nextInt();

        System.out.printf("sum = %d%n", i1 + i2);

        System.out.println("are you ok?");
        boolean ans = inout.nextBoolean();
        System.out.println(ans);
    }
}