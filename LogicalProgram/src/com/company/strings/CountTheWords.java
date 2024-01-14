package com.company.strings;

import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = scanner.nextLine();

        System.out.println("No. Of Words : " +input.split(" ").length);
    }
}
