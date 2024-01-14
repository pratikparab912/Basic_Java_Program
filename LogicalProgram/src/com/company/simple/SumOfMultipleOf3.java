package com.company.simple;

import java.util.ArrayList;

public class SumOfMultipleOf3 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        int sum = 0;

        for(int i=1; i<=10; i++) {
            if(i%3 == 0) {
                number.add(i);
                sum += i;
            }
        }

        System.out.println(number);
        System.out.println(sum);
    }
}
