package com.java.lambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWord {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("apple", "orange", "banana");

        List<String> res = lines.stream().filter(x -> !x.equals("banana")).collect(Collectors.toList());

        res.forEach(System.out::println);

        List<String> lstring = Arrays.asList("ant","mouse","cat");
        List<String> ret = lstring.stream().filter(x->!x.equals("ant")).collect(Collectors.toList());
        System.out.println(ret);
        ret.forEach(System.out::println);






    }
}
