package com.company.simple;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        int digit;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        while(number!=0) {
            digit = number % 10;
            if(digit%2 == 0) {
                sumOfEven += digit;
            } else {
                sumOfOdd += digit;
            }
            number = number / 10;
        }

        System.out.println("Sum Of Even : " +sumOfEven);
        System.out.println("Sum Of Odd : " +sumOfOdd);
    }
}
