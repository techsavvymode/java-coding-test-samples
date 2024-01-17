package com.java.lambda.lambda;

//zero arg
@FunctionalInterface
interface FuncPrint{
    void printValue();
}

//one arg
interface FunMultiply{
    void mult(int x);

    default void justPrint(){
        System.out.println("Just normal default");
    }
}

//two arg
interface FunAdd{
    void add(int x, int y);
}


public class LambdaSimple {
    public static void main(String[] args) {

        //no arg
        FuncPrint funcPrint=()-> System.out.println("empty arg");
        funcPrint.printValue();

        //one arg
        FunMultiply funcultiply = (x -> System.out.println(x*x));
        funcultiply.mult(3);

        //two arg
        FunAdd funAdd = (x,y)-> System.out.println(x+y);
        funAdd.add(3,4);



    }
}
