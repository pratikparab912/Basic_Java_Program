package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0, n2=1;
        int n3;
        System.out.print(n1 + " " + n2);
        int count = 10;
        for(int i=2;i<=count-1;i++) {
            n3 = n1 + n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
    }
}
