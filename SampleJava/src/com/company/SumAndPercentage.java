package com.company;

import java.util.Scanner;

public class SumAndPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first : ");
        int a = scanner.nextInt();

        System.out.println("Enter second : ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println(sum);

        float percentage = sum/2;
        System.out.println(percentage);
    }
}
