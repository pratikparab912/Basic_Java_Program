package com.company;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Salary : ");
        double basicSalary = scanner.nextDouble();

//        System.out.println("HRA : ");
//        double hra = scanner.nextDouble();
//
//        System.out.println("DA : ");
//        double da = scanner.nextDouble();
        double hra,da;

        if(basicSalary <= 25000) {
            hra = 0.1 * basicSalary;
            da = 0.98 * basicSalary;
        } else {
            hra = 25 * basicSalary;
            da = 1.25 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;
        System.out.println("GrossSalary : " +grossSalary);
    }
}
