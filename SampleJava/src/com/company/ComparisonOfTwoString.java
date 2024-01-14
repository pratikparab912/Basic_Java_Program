package com.company;

public class ComparisonOfTwoString {
    public static void main(String[] args) {
        String str1 = new String("Pratik");
        String str2 = new String("Pratik");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

                // == : false (both have different addresses in memories)
        // equals : true (Compairing Only Values Of Two Object)
    }
}
