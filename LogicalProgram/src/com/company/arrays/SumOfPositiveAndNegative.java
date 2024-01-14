package com.company.arrays;

import java.util.Scanner;

public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("\nEnter an elements of an array : ");
        for(int i=0;i<=arr.length-1;i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nGiven Array : ");
        for(int i=0;i<=arr.length-1;i++) {
            System.out.print(arr[i] +" ");
        }

        int nSum = 0;
        int pSum = 0;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]<0 && arr[i]!=0) {
                nSum += arr[i];
            } else {
                if (arr[i]>0 && arr[i]!=0) {
                    pSum += arr[i];
                }
            }
        }

        System.out.println("\nSum Of Positive Numbers : " +pSum);
        System.out.println("\nSum Of Negative Numbers : " +nSum);
    }
}
