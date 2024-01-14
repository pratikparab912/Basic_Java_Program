package com.company.simple;

import java.util.Scanner;

public class IntegerToBinarySecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println("\nBinary Number : ");
        System.out.println(Integer.toBinaryString(number));
    }
}
