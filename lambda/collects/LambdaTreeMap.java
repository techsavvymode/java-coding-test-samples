package com.java.lambda.collects;

import java.util.TreeMap;

public class LambdaTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>((o1,o2)->o1>o2 ? -1 : o1<o2 ? 1 : 0);
        treeMap.put(1,"Apple");
        treeMap.put(4,"Orange");
        treeMap.put(3,"Pineapple");
        treeMap.put(2,"Banana");

        System.out.println(treeMap);
    }
}
