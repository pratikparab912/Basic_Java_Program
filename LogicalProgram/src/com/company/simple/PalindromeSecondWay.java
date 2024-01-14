package com.company.simple;

import java.util.Scanner;

public class PalindromeSecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = scanner.next();

        StringBuffer stringBuffer = new StringBuffer(number);
        String result = stringBuffer.reverse().toString();
        System.out.println((result.equals(number)) ? "Is a Palindrome" : "Is not a Palindrome");
    }
}
