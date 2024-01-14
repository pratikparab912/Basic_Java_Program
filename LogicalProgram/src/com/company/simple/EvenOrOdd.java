package com.company.simple;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number<=0) {
            System.out.println("Invalid Number");
        } else {
            if(number%2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
    }
}
