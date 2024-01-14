package com.company.arrays;

import java.util.Scanner;

public class PrintEvenNumbersInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("\nEnter an elements of an array : ");
        for(int i=0; i<=arr.length-1 ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nGiven Array : ");
        for(int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\nAn Even number in an given array : ");
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] +" ");
            }
        }

        int sum = 0;
        for(int i=0; i<=arr.length-1;i++) {
            if(arr[i]%2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("\nSum Of An Even Numbers : " +sum);
    }
}
