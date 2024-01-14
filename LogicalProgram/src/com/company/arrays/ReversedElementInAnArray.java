package com.company.arrays;

import java.util.Scanner;

public class ReversedElementInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
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
//
//        int startNumber = 0;
//        int endNumber = arr.length-1;
//
//        while (startNumber<endNumber) {
//            int temp = arr[startNumber];
//            arr[startNumber] = arr[endNumber];
//            arr[endNumber] = temp;
//
//            startNumber++;
//            endNumber--;
//        }
//
//        System.out.println("\nReversed an element of an array : ");
//        for (int i = 0; i <= arr.length-1 ; i++) {
//            System.out.print(arr[i] +" ");
//        }

        for(int j=0; j<(arr.length/2); j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = temp;
        }

        System.out.println("\nReversed an element of an array : ");
        for (int j = 0; j <= arr.length-1; j++) {
            System.out.print(arr[j] +" ");
        }

    }

}
