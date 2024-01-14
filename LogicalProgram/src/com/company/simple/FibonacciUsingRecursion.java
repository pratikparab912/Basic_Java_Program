package com.company.simple;

import java.util.Scanner;

public class FibonacciUsingRecursion {

    public static int fibonacciRecursion(int num) {
        if(num == 0 || num == 1) {
            return num;
        } else {
            return fibonacciRecursion(num -1) + fibonacciRecursion(num -2);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        System.out.println("\nFibonacci Series : ");
        for(int i=0;i<=number-1;i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
}
