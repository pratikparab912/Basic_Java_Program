package com.company.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scanner.next();
//        String output = "";
//
//        for(int i=input.length()-1; i>=0; i--) {
//            output = output + input.charAt(i);
//        }
//
//        System.out.println(output);

        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.reverse());
    }
}
