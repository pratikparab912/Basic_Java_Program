package com.company;

import java.util.Arrays;

public class SecondMaxInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};
        //Aproach 1
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);

        //Approach 2
        int max = arr[0];
        int sec_max = arr[1];

        for(int i=0;i<= arr.length-1;i++) {
            if(arr[i] > max) {
                sec_max = max;
                max=arr[i];
            } else {
                if(arr[i] > sec_max) {
                    sec_max = arr[i];
                }
            }
        }

        System.out.println(max);
        System.out.println(sec_max);
    }
}
