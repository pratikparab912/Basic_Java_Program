package com.company.arrays;

import java.util.Scanner;

public class MinAndMaxInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("\nEnter an elements of an array : ");
        for (int i = 0; i <= arr.length-1 ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nGiven Array : ");
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i] +" ");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        System.out.println("\nMaximum Number in an element : " +max);
        System.out.println("\nMinimum Number in an element : " +min);
    }
}
