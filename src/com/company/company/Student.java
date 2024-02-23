package com.company.company;

import java.util.Arrays;

public class Student {


    private String name;
    private String surname;
    private Integer age;
    private String birthdate;
    private String faculty;
    private String level;

    public Student(String name, String surname, Integer age, String birthdate, String faculty, String level) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthdate = birthdate;
        this.faculty = faculty;
        this.level = level;
    }

    public Student(String name, String surname, String age, String birthDate, Integer level) {

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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                ", faculty='" + faculty + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
