package com.company.simple;

import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int count = 0;

        while(number!=0) {
            count++;
            number = number / 10;
        }

        System.out.println("Output : " +count);
    }
}
