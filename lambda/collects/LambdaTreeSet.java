package com.java.lambda.collects;

import java.util.TreeSet;

public class LambdaTreeSet {
    public static void main(String[] args)
    {
        TreeSet<Integer> h = new TreeSet<Integer>();
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are asc: " + h);

        TreeSet<Integer> h1 =
                new TreeSet<Integer>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        h1.add(850);
        h1.add(235);
        h1.add(1080);
        h1.add(15);
        h1.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are desc: " + h1);

        TreeSet<Integer> h12 =
                new TreeSet<Integer>((o1, o2) -> o2.compareTo(o1));
        h12.add(850);
        h12.add(235);
        h12.add(1080);
        h12.add(15);
        h12.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are desc: " + h12);
    }
}
