package com.java.lambda;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TEsts {
    private static String n = "a";
private int i=1;
    public static void main(String[] args) throws ParseException {
        List<String> f = new ArrayList<String>();
        f.add("Mango");
        f.add("Pineapple");
        f.add("Apple");
        f.add("Orange");
        Stream<String> fruitlist = f.parallelStream();
        fruitlist.filter(fr->{
            System.out.println("Fruit "+fr);
            return false;
        })
                .forEach(fr->{});

    }

}


