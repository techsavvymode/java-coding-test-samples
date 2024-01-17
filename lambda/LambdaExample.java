package com.java.lambda;


interface  Shapes{
    void draw();
}

class Rectangle implements Shapes{

    @Override
    public void draw() {
        System.out.println("Traditional way");
    }
}

public class LambdaExample {

    public static void main(String[] args) {
        Shapes shape = () ->  System.out.println("lambda way");
        shape.draw();
    }
}
