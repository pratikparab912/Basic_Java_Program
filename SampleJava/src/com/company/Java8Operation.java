package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Operation {
    public static void main(String[] args) {
        int[] arr = {2,1,7,6,4,-2,9};

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<= arr.length-1;i++) {
            list.add(arr[i]);
        }
        System.out.println(list);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(avg);

        List<Integer> multipleOfTwo = list.stream()
                .map(a -> a * 2)
                .collect(Collectors.toList());
        System.out.println(multipleOfTwo);

        List<Integer> divideByTwo = list.stream()
                .filter(a -> a%2==0)
                .collect(Collectors.toList());
        System.out.println(divideByTwo);
    }
}
