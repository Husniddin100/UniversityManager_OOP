package com.company;

public class Student {
   private String name;
   private String surname;
  private String age;
  private String birthDate;
  private Integer level;
  private int studentId=1;


    public Student(String name, String surname, String age, String birthDate, Integer level, int studentId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.level = level;
        this.studentId = studentId;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", level=" + level +
                ", studentId=" + studentId +
                '}';
    }
}
