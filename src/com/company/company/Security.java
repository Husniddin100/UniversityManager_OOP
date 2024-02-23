package com.company.company;

public class Security {
    private String name;
    private String surname;
    private   int age;
    private   String brithData;
    private Double salari;
    private   String militariRank;
    private   int id;

    public Security() {
    }

    public Security(String name, String surname, int age, String brithData, Double salari, String militariRank, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.brithData = brithData;
        this.salari = salari;
        this.militariRank = militariRank;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getBrithData() {
        return brithData;
    }

    public Double getSalari() {
        return salari;
    }

    public String getMilitariRank() {
        return militariRank;
    }

    @Override
    public String toString() {
        return "Security{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", brithData='" + brithData + '\'' +
                ", salari=" + salari +
                ", militariRank='" + militariRank + '\'' +
                ", id=" + id +
                '}';
    }
}