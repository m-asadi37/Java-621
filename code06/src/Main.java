import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {

        int I = 5;
        switch (I) {
            case 1: {
                System.out.println("sat");
                System.out.println("***");
            }
            case 2:
                System.out.println("sun");
                break;
            case 3:
                System.out.println("mon");
                break;
            default:
                System.out.println("default code...");
        }


        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i /= 2)
            System.out.printf("%d ", i);

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("do you want to continue? ");
        boolean isAgain = scan.nextBoolean();

        while (isAgain) {
            System.out.print("do you want to continue? (in part 1)");
            isAgain = scan.nextBoolean();
        }

        int i1 = 10;
        while (i1 > 0) {
            System.out.println("i1 is positive");
            i1--;
        }

        do {
            System.out.print("do you want to continue? (in part 2)");
            isAgain = scan.nextBoolean();
        } while (isAgain);
    }

    public static void main2(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("end of program");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = {1, 20, 13, 41};

        String[] arr2 = new String[5];


        /*
        for (int i = 0; i < 5; i++) {
            String name = scan.nextLine();
            System.out.println("hello " + name);
        }*/

    }
}
