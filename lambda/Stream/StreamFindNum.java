package com.java.lambda.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFindNum {
    public static void main(String[] args) {

        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(5);
        lists.add(3);
        lists.add(6);
        lists.add(4);

        List<Integer> oddNum = lists.stream()
                .filter(x->x%2!=0)
                .collect(Collectors.toList());
        oddNum.forEach(System.out::println);
        System.out.println("+++");
        List<Integer> multiplyNum = oddNum.stream()
                .map(x->x*5)
                .collect(Collectors.toList());
        multiplyNum.forEach(System.out::println);

        int sum = multiplyNum.stream()
                .reduce(0,(x,y)->x+y);
        System.out.println("s"+sum);





    }
}
