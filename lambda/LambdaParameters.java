package com.java.lambda;

interface Addable{
    int addition(int a, int b);
}
public class LambdaParameters {
    public static void main(String[] args) {
//        Addable addable = (a,b)->(a+b);
//        System.out.println(addable.addition(2,3));

        Addable addable1 =((a, b) -> {
           int r = a+b;
           return r;
        });
        System.out.println(addable1.addition(3,3));
    }

}
