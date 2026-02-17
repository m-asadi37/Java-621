package entity;

public class Teacher {

    private int id;
    private String name;
    private String family;
    private int experience;
    private double salary;

    public Teacher(int id, String name, String family, int experience, double salary) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.experience = experience;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.printf("[id: '%d', name:'%s', family:'%s', experience:'%d', salary:'%,.0f']\n",
                id, name, family, experience, salary);
    }
}
