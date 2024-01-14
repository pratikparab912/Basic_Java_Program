package com.company;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first : ");
        int a = scanner.nextInt();

        System.out.println("Enter second : ");
        int b = scanner.nextInt();

        System.out.println("--------------------Before Swapping--------------------");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\n--------------------After Swapping-----------------------------");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
