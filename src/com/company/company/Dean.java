package com.company.company;

public class Dean {

    private String name;
    private Integer id=1;
    private String surname;
    private Integer age;
    private String birthdate;
    private String faculty;
    private Double salary;
    private String startjobsdate;

    public Dean(String name, String surname, Integer age, String birthdate, String faculty, Double salary, String startjobsdate) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.birthdate = birthdate;
        this.faculty = faculty;
        this.salary = salary;
        this.startjobsdate = startjobsdate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStartjobsdate() {
        return startjobsdate;
    }

    public void setStartjobsdate(String startjobsdate) {
        this.startjobsdate = startjobsdate;
    }

    @Override
    public String toString() {
        return "Dean{" +
                " id=" + id +" " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                ", faculty='" + faculty + '\'' +
                ", salary=" + salary +
                ", startjobsdate='" + startjobsdate + '\'' +
                '}';
    }
}
