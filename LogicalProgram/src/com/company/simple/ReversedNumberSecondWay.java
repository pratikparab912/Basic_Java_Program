package com.company.simple;

import java.util.Scanner;

public class ReversedNumberSecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        String result = " " +number;

        StringBuilder stringBuilder = new StringBuilder(result);
        System.out.println("Reversed Number : " +stringBuilder.reverse());
    }
}
