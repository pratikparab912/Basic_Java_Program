package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};

        //First Approach
//        int max = arr[0];
//        for(int i=0;i<= arr.length-1;i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        //Second Approach
//        int max = Arrays.stream(arr).max().getAsInt();
//        System.out.println(max);

        //Third Approach
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

        //Fourth Approach
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}
