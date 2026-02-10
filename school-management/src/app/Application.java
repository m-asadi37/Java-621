package app;

import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isExit = false;
        while (!isExit) {

            int menu = printMenu();

            switch (menu) {
                case 1 -> {
                    int submenu = printStudentMenu();
                    switch (submenu) {
                        case 1 -> {

                        }
                    }
                }
                case 0 -> isExit = true;
            }
        }
    }

    private static int printStudentMenu() {
        System.out.println("*** Student ***");
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. update");
        System.out.println("4. info");
        System.out.println("5. list");
        System.out.println("0. exit");

        return scanner.nextInt();
    }

    private static int printMenu() {
        System.out.println("*** SCHOOL MANAGEMENT ***");
        System.out.println("1. STUDENT");
        System.out.println("2. TEACHER");
        System.out.println("3. COURSE");
        System.out.println("0. EXIT");
        return scanner.nextInt();
    }

    //....
}
