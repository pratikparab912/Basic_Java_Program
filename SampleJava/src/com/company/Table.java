package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("Table of " +num+ " : ");

        for(int i=1;i<=10;i++) {
            System.out.println(num * i);
        }
    }
}
