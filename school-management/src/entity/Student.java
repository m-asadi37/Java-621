package entity;

import java.time.LocalDate;

public class Student {

    private String name;
    private String family;
    private String code;
    private double score;
    private LocalDate birthday;

    public Student(String name, String family, String code, LocalDate birthday) {
        this.name = name;
        this.family = family;
        this.code = code;
        this.birthday = birthday;
        this.score = 0.0;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
