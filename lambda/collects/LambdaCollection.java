package com.java.lambda.collects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LambdaCollection {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(205,102,98,275,203));

        System.out.println("Elements Before "+al);

        Collections.sort(al);
        System.out.println("Elements Natural Asc "+al);

        Collections.sort(al, (o1,o2)->(o1>o2) ? -1 : (o2<o1) ? 1 : 0 );

        System.out.println("Elements After Desc "+al);


    }
}
