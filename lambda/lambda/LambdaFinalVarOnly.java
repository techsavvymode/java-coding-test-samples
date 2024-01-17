package com.java.lambda.lambda;

interface NumTest{
    int doSth(int i);
}
public class LambdaFinalVarOnly {

    public static void main(String[] args) {
        int num = 1;
        NumTest numTest = (n)-> {
            int value = num+n;
            //num++;
            return value;
        };

        System.out.println("test");
        System.out.println(numTest.doSth(3));
    }
}
