package com.company;

public class SecondMinimumInAnArray {

    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};

        int min = arr[0];
        int sec_min = arr[1];

        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i] < min) {
                sec_min = min;
                min = arr[i];
            } else {
                if(arr[i] < sec_min) {
                    sec_min = arr[i];
                }
            }
        }

        System.out.println(min);
        System.out.println(sec_min);
    }

}
