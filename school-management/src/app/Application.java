package app;

import entity.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static Student[] students = new Student[10];

    public static void main(String[] args) {
        scanner.useDelimiter("\n");

//        List<Student> lists = new ArrayList<>();
        boolean isExit = false;
        while (!isExit) {

            int menu = printMenu();

            boolean isBack = false;
            do {
                switch (menu) {
                    case 1 -> {
                        int submenu = printStudentMenu();
                        switch (submenu) {
                            case 1 -> addStudent();
                            case 2 -> removeStudent();
                            case 0 -> isBack = true;
                        }
                    }
                    case 0 -> isExit = true;
                }
            } while (!isBack);
        }
    }

    private static void removeStudent() {
        System.out.print("code: ");
        String code = scanner.next();

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getCode().equals(code)) {
                students[i] = null;
                System.out.println(">> student removed successfully!");
                break;
            }
        }
        //TODO: not found message
    }

    private static void addStudent() {
        System.out.print("name: ");
        String name = scanner.next();
        System.out.print("family: ");
        String family = scanner.next();
        System.out.print("code: ");
        String code = scanner.next();
        System.out.print("birthday: ");
        String dateStr = scanner.next();
        LocalDate birthday = LocalDate.parse(dateStr, DateTimeFormatter.ISO_DATE);
        Student student = new Student(name, family, code, birthday);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println(">> student added!");
                break;
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
        System.out.println("0. back");

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
