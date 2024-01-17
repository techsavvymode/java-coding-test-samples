package com.java.lambda.functional;

public class RunnableDemo {
    public static void main(String[] args) {

        //Runnable runnable = ()-> System.out.println("run");
        Thread thread = new Thread(()-> System.out.println("run"));
        thread.start();
    }
}
