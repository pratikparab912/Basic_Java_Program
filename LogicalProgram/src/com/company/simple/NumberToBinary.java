package com.company.simple;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        int[] binaryNumber = new int[10];
        int count = 0;

        while(number!=0) {
            binaryNumber[count] = number % 2;
            number = number / 2;
            count++;
        }

        for(int j=count-1;j>=0;j--) {
            System.out.print(binaryNumber[j]);
        }

    }
}
