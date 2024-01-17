package com.java.lambda.lambda;


interface TakeThreeArg{
    int addThree(int a, int b, int c);
}

public class LambdaCallInnInterface {
    private static int callInt(int x, int y, int z, TakeThreeArg takeThreeArg){
        return takeThreeArg.addThree(x,y,z);
    }

    public static void main(String[] args) {
        TakeThreeArg takeThreeArg = (a,b,c)->a+b*c;

        System.out.println(callInt(2,3,4, takeThreeArg));

    }
}
