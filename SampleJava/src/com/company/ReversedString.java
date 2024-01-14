package com.company;

public class ReversedString {

    public static String reversedString(String input) {
        String result = " ";

        for(int i=input.length()-1;i>=0;i--) {
            result = result + input.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(ReversedString.reversedString("pratik"));
    }
}
