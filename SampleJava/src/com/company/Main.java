package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a radius of circle : ");
        int radius = scanner.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("Area Of Circle : " +area);

        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference Of Circle : " +circumference);
    }
}
