package app;

import entity.Student;
import entity.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static Student[] students = new Student[10];
    private static Teacher[] teachers = new Teacher[10];

    public static void main(String[] args) {
        scanner.useDelimiter("\n");

//        List<Student> lists = new ArrayList<>();
        boolean isExit = false;
        while (!isExit) {

            int menu = printMenu();
            switch (menu) {
                case 1 -> {
                    boolean isBack = false;
                    while (!isBack) {
                        int submenu = printStudentMenu();
                        switch (submenu) {
                            case 1 -> addStudent();
                            case 2 -> removeStudent();
                            case 3 -> updateStudent();
                            case 4 -> infoStudent();
                            case 5 -> showStudentsList();
                            case 0 -> isBack = true;
                        }
                    }
                }
                case 2 -> {
                    boolean isBack = false;
                    while (!isBack) {
                        int submenu = printTeacherMenu();
                        switch (submenu) {
                            case 1 -> addTeacher();
                            case 2 -> removeTeacher();
                            case 3 -> updateTeacher();
                            case 4 -> infoTeacher();
                            case 5 -> showTeacherList();
                            case 0 -> isBack = true;
                        }
                    }
                }
                case 0 -> isExit = true;
            }

        }
    }

    private static void showTeacherList() {
        for (Teacher find : teachers) {
            if(find != null){
                find.showInfo();
            }
        }
    }

    private static void infoTeacher() {
        System.out.print("ID: ");
        int id = scanner.nextInt();

        for (Teacher find : teachers) {
            if(find != null && find.getId() == id){
                find.showInfo();
                return;
            }
        }
        System.out.println(">> Teacher ID Not Found!");
    }

    private static void updateTeacher() {
        System.out.print("id for update: ");
        int id = scanner.nextInt();

        for (Teacher find : teachers) {
            if(find != null && find.getId() == id){
                System.out.println("new experience: ");
                int newExperience = scanner.nextInt();
                System.out.println("new salary: ");
                double newSalary = scanner.nextDouble();

                find.setExperience(newExperience);
                find.setSalary(newSalary);

                System.out.println(">> Teacher Experience And Salary Updated!");
                return;
            }
        }
        System.out.println(">> Teacher ID Not Found!");
    }

    private static void removeTeacher() {
        System.out.print("id for remove: ");
        int id = scanner.nextInt();

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId() == id) {
                teachers[i] = null;
                System.out.println(">> Teacher removed successfully!");
                return;
            }
        }
        System.out.println(">> Teacher Not Found!");
    }

    private static void addTeacher() {
        System.out.print("id: ");
        int id = scanner.nextInt();
        System.out.print("name: ");
        String name = scanner.next();
        System.out.print("family: ");
        String family = scanner.next();
        System.out.print("salary: ");
        double salary = scanner.nextDouble();
        System.out.print("experience: ");
        int experience = scanner.nextInt();

        Teacher teacher = new Teacher(id, name, family, experience, salary);
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                System.out.println(">> Teacher added!");
                break;
            }
        }
    }

    private static int printTeacherMenu() {
        System.out.println("*** TEACHER MENU ***");
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. update");
        System.out.println("4. info");
        System.out.println("5. list");
        System.out.println("0. back");

        return scanner.nextInt();
    }

    private static void showStudentsList() {
        for (Student find : students) {
            if (find != null) {
                find.showInfo();
            }
        }
    }

    private static void infoStudent() {
        System.out.print("code: ");
        String code = scanner.next();

        for (Student find : students) {
            if (find != null && find.getCode().equals(code)) {
                find.showInfo();
                return;
            }
        }
        System.out.println(">> student not found!");
    }

    private static void updateStudent() {
        System.out.print("code for update: ");
        String code = scanner.next();

        System.out.print("new grade: ");
        double grade = scanner.nextDouble();

        for (Student find : students) {
            if (find != null && find.getCode().equals(code)) {
                find.setScore(grade);
                System.out.println(">> student updated!");
                return;
            }
        }
        System.out.println(">> student not found!");
    }

    private static void removeStudent() {
        System.out.print("code: ");
        String code = scanner.next();

        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getCode().equals(code)) {
                students[i] = null;
                flag = true;
                System.out.println(">> student removed successfully!");
                break;
            }
        }
        if (!flag)
            System.out.println(">> student not found!");
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
