package com.company;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        //Converting int into String
        String result = " " +number;

        StringBuilder stringBuilder = new StringBuilder(result);
        System.out.println(stringBuilder.reverse());
    }
}
