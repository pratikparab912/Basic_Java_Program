package com.company.simple;

import java.util.Scanner;

public class DigitRefractorOrReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int digit;

        System.out.println("Output : ");

        while (number!=0) {
            digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
    }
}
