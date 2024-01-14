package com.company.recursion;

public class SumOfNumbersTillN {

    public static int sum(int number) {
        if(number<=1) {
            return number;
        } else {
            return number + sum(number-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(SumOfNumbersTillN.sum(10));
    }
}
