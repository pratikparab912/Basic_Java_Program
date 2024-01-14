package com.company.arrays;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("\nEnter the elements in an array : ");
        for(int i=0;i<=arr.length-1;i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nGiven array : ");
        for (int i=0; i<=arr.length-1;i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
