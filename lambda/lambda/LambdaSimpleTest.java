package com.java.lambda.lambda;

@FunctionalInterface
interface NoArg{
    abstract void justPrint();
}

interface OneArg{
    abstract void sqrtNum(int num);

}

interface TwoArg{
    abstract void addTwoNum(int a, int b);
}

interface ThreeArg{
    abstract void multiplyThreeNum(int a, int b, int c);

}


public class LambdaSimpleTest {
    public static void main(String[] args) {
        NoArg noArg = ()-> System.out.println("Just Printing");
        noArg.justPrint();

        OneArg oneArg = (x) -> System.out.println(Math.sqrt(x));
        oneArg.sqrtNum(4);

        TwoArg twoArg =(x,y)-> System.out.println(x+y);
        twoArg.addTwoNum(3,4);

        ThreeArg threeArg = (a, b, c)-> System.out.println(a*b*c);
        threeArg.multiplyThreeNum(2,3,4);


    }
}
