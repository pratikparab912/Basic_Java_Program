package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principal Amount : ");
        double p = scanner.nextDouble();

        System.out.println("Enter Number Of Years : ");
        int n = scanner.nextInt();

        System.out.println("Enter Rate Of Interest : ");
        double r = scanner.nextDouble();

        double simpleInterest = ((p*n*r) / 100 );
        System.out.println(simpleInterest);
    }
}
