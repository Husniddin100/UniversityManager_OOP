package com.company.company;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UniversityManager universityManager = new UniversityManager("       TATU      ");
        System.out.println(universityManager.getUniversityName());
        System.out.println("-----------------------\t ");
        System.out.println("         *** Task 2 ***     ");
        System.out.println(universityManager.createSubject("test", 1));
        System.out.println(universityManager.createSubject("tes1t", 2));
        System.out.println("----------------------");
        System.out.println("      *** Task 3 ***   ");
        System.out.println(universityManager.createDean("Ali", "Aliyev", 41, "27.09.1982", "TDPU", 654.20, "05,01,2022"));
        System.out.println(universityManager.createDean("Alisher", "Aliboyev", 43, "21.02.1980", "TATU", 800.20, "02,01,2023"));
        System.out.println("----------------------");
        System.out.println("      *** Task 4 ***");
        System.out.println(universityManager.createSecurity("Alibek", "Alisherov", 24, "22,04,1999", 500.0, "Kap"));
        System.out.println("-----------------------");
        System.out.println("     ***Task 5 ***");
        System.out.println(universityManager.createProfessor("ali", "aliyev", 45, "22,04,1978", 100.10, 1));
        System.out.println(universityManager.createProfessor("vali", "aliyev", 45, "22,04,1978", 100.10, 1));
        System.out.println("-----------------------");
        System.out.println("            ***Task 6 ***     ");
        System.out.println(universityManager.createStudent("Axror","Axrorov","22","2,01,2001",2));





    }
}
