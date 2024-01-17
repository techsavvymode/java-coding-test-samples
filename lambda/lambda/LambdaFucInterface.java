package com.java.lambda.lambda;

interface ComplexInterface{
    abstract void doPrint();

    default void defMethod(){
        System.out.println("default Method");
    }
}
public class LambdaFucInterface {
    public static void main(String[] args) {
        ComplexInterface complexInterface = ()-> System.out.println("this is abstract");
        complexInterface.doPrint();
        complexInterface.defMethod();

    }
}
