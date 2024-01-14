package com.company.strings;

import java.util.Scanner;

public class VowelRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = scanner.nextLine();

        System.out.println("Removal Of Vowel : " +input.replaceAll("[aeiou]",""));
    }
}
