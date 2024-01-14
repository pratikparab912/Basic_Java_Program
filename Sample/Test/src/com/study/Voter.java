package com.study;

import java.util.Scanner;

public class Voter {
    private static int age;
    static void validate() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Enter age : ");

        if (age < 18)
            throw new InvalidAgeException("Invalid Age, You are not eligible to vote.");
        else
            System.out.println("Valid Age, Welcome To Vote.");
    }
    public static void main(String[] args) {

        try {
            validate();
        } catch (Exception e) {
            System.out.println("Caught an Exception : " +e);
        }
    }
}
