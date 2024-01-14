package com.company.simple;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        int digit;
        int result = 0;
        int temp = number;

        while(number!=0) {
            digit = number % 10;
            result = result*10 + digit;
            number = number / 10;
        }
        System.out.println((result==temp) ? "Is a Palindrome Number" : "Is not a Palindrome Number");
    }
}
