package com.company.simple;

import java.util.ArrayList;

public class SumOfMultipleOf2And3 {
    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};

        ArrayList<Integer> number = new ArrayList<>();

        int multipleOfTwo = 0;
        int multipleOfThree = 0;

        for(int i=0; i<= arr.length-1;i++) {
            if(arr[i]%2 == 0) {
                number.add(arr[i]);
                multipleOfTwo += arr[i];
            }
         }

        for(int j=0; j<= arr.length-1;j++) {
            if (arr[j]%3 ==0) {
                number.add(arr[j]);
                multipleOfThree += arr[j];
            }

        }

        System.out.println(multipleOfTwo);
        System.out.println(multipleOfThree);

        int sum = multipleOfTwo + multipleOfThree;
        System.out.println(sum);
    }
}
