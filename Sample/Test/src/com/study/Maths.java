package com.study;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter a number :" );
        int number2 = scanner.nextInt();
        System.out.println("Enter another number : ");

        int sum = number + number2;
        System.out.println(sum);
    }
}
