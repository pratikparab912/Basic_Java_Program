package com.company.simple;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        // 29, 59 = Specail Number
        // 29 = (2*9)+(2+9)

        int digit1;
        int digit2;
        int result = 0;
        digit1 = number % 10;
        digit2 = number / 10;
        result =(digit1*digit2) + (digit1+digit2);
        System.out.println(result==number ? "Speacial Number" : "Not a special number");
    }
}
