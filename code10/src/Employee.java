public class Employee {

    //property
    String name;
    String family;
    String job;
    int income;

    //method
    //void : not have any result to return
    //[return type] [name] ( [args1], [arg2], .. ) { code.. }
    void sayHello() {
        System.out.println("Hello!!!");
    }

    void info() {
        System.out.printf("name : %s, family : %s, job : %s, income : %,d%n", name, family, job, income);
    }

    void giveSalary(int salary) {
        income += salary;
        System.out.println("Salary: " + salary);
    }

    String answer(String question) {
        if(question.equals("Are you Ok?"))
            return "Yes";
        else if (question.equals("do you can to finish this project?"))
            return "No!!!!";
        else
            return "i dont know";
    }


}
