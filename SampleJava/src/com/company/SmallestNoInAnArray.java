package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNoInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};

        //First Approach
//        int min = arr[0];
//        for(int i=0;i<= arr.length-1;i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

        //Second Approach
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-7]);

        //Third Approach
//        int min = Arrays.stream(arr).min().getAsInt();
//        System.out.println(min);

        //Fourth Approach
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<= arr.length-1;i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(Collections.min(list));
    }
}
