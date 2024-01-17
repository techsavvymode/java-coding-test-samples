package com.java.lambda.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaArrayPrint {
    public static void main(String[] args) {
        //many ways to create arraylist

        ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

        ArrayList<String> arrStr = new ArrayList<String>();
        arrStr.add("New York");
        arrStr.add("New Jersey");
        arrStr.add("Connecticut");

        List<String> places = Arrays.asList("Times Square", "Empire State", "Battery Park");

        List<String> listInJava9 = List.of("new", "way", "to create", "list");

        List<String> anotherlist = Stream.of("list", "and", "stream").collect(Collectors.toList());

        Stream<String> streamlist = Stream.of("oh", "my", "god");

        var strings = Stream.of("what", "is", "this", "java16");

        arrL.forEach(n-> System.out.print(n +" "));
        System.out.println("===");
        arrL.forEach(n-> System.out.print(n*n + " "));
        System.out.println("===");

        arrL.forEach(n->{
            if(n%2==0)
                System.out.println(n);
        });











    }
}
