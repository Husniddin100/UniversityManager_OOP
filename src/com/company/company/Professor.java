package com.company.company;

public class Professor {

    private String name;
    private String surname;
    private Integer age;
    private String birthdate;
    private Double salary;
    private Integer subjectId=1;
    public Integer professorId = 1;

    public Professor(String name, String surname, Integer age, String birthdate, Double salary, Integer subjectId, Integer professorId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthdate = birthdate;
        this.salary = salary;
        this.subjectId = subjectId;
        this.professorId = professorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                ", salary=" + salary +
                ", subjectId=" + subjectId +
                ", professorId=" + professorId +
                '}';
    }
}
