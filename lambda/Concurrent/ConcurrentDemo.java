package com.java.lambda.Concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//you cannot modify run in ArrayList, however you can use CopyOnWriteArrayList to modify
public class ConcurrentDemo extends Thread {
    //static ArrayList al = new ArrayList(); //this arraylist will give exception
    static CopyOnWriteArrayList al = new CopyOnWriteArrayList();
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        al.add("C");
    }
    public static void main(String[] args) throws InterruptedException {
        al.add("A");
        al.add("B");

        ConcurrentDemo c = new ConcurrentDemo();
        c.start();

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            String s = (String) itr.next();
            System.out.println(s);
            Thread.sleep(6000);
        }
        System.out.println(al);

    }
}
