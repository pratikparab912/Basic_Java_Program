package com.company.simple;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int digit;
        int sum = 0;

        while (number!=0) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Sum Of Digit : " +sum);
    }
}
