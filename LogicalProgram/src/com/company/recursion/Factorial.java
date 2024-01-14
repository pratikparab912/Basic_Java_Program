package com.company.recursion;

public class Factorial {

    public static int recursiveFactorial(int number) {
        if(number==0) {
            return 1;
        } else {
            return number * recursiveFactorial(number-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial.recursiveFactorial(5));
    }
}
