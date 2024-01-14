package com.company.arrays;

import java.util.Scanner;

public class PrintLastMElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];

        System.out.println("\nEnter an elements of an array: ");
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nGiven array : ");
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\nEnter the number of last elements in an array : ");
        int lastElements = scanner.nextInt();

        System.out.println("\nRemaining array : ");
        if(lastElements<arraySize) {
            for(int i = arraySize-lastElements ; i<= arr.length-1; i++) {
                System.out.print(arr[i] +" ");
            }
        } else {
            System.out.println("Enter a valid input!");
        }
    }
}
