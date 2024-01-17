package com.java.lambda.lambda;

interface NoArgs{
    void print();
}

interface TwoArgs{
    void print(int x, int y);
}

interface ThreeArgs{
    void print(int x, int y, int z);

}
public class LambdaCallInnInterface2 {
    private static void call(NoArgs noArg){
        noArg.print();
    }

    private static void call(TwoArgs oneArgs, int a, int b){
        oneArgs.print(a,b);
    }

    private static void call(ThreeArgs threeArgs, int a, int b, int c) {
        threeArgs.print(a, b, c);
    }

    public static void main(String[] args) {
        call(()-> System.out.println("Just Printing as no arg"));
        call((a,b)-> System.out.println(a+b),10,20);
        call((a,b,c)-> System.out.println(a+b+c),2,5,9);
    }

}
