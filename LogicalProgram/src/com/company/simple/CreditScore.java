package com.company.simple;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a credit score");
        int score = scanner.nextInt();

        if(score<400 || score>850) {
            System.out.println("Invalid Card");
        } else {
            if(score>=400 && score<600) {
                System.out.println("Silver Card");
            } else if(score>=600 && score<800) {
                System.out.println("Gold Card");
            } else {
                System.out.println("Platinum Card");
            }
        }
    }
}
