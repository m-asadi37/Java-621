import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i1 = 100;
//        Scanner input = new Scanner(System.in);
//        input.nextLine();


        Employee e1 = new Employee();
        e1.name = "lora";
        e1.family = "grow";
        e1.income = 10000;
        e1.job = "Programmer";

        String name = e1.name;
        System.out.printf("employee 1 name is : %s%n", name);
        System.out.printf("employee 1 family is : %s%n", e1.family);

        Employee e2 = new Employee();
        e2.name = "Arash";
        e2.family = "Kaman gir";
        e2.income = 50000;
        e2.job = "Manager";
        e2.sayHello();
        e1.sayHello();

        e1.info();
        e2.info();

        e1.giveSalary(500);
        e1.info();

        String var = e1.answer("Are you Ok?");
        System.out.println(var);

        System.out.println(e2.answer("do you can to finish this project?"));

        Calculator calc = new Calculator();
        int result = calc.sum(12,5);
        System.out.println(result);
    }
}
