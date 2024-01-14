package com.company;

public class Factorial {

    public static int factorial(int number) {
        if(number==0) {
            return 1;
        } else {
            for(int i=number-1;i>=1;i--) {
                number = number * i;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));
    }
}
