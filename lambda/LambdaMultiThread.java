package com.java.lambda;

public class LambdaMultiThread {
    public static void main(String[] args) {

        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName()+" print run method");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
