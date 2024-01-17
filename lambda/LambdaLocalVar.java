package com.java.lambda;

interface NumInput{
    void getNum(int a);
}
//Note: It is important to emphasize that a lambda expression can use and modify an instance variable
// from its invoking class. It just can’t use a local variable of its enclosing scope
// unless that variable is effectively final.

public class LambdaLocalVar {
    int instVar = 5;


    public static void main(String[] args) {
        NumInput numInput = (p)-> System.out.println(p);
        numInput.getNum(4);

        //instance variable can be modified
        LambdaLocalVar l = new LambdaLocalVar();
        NumInput numInput1 = (p)-> {
            System.out.println(p+ l.instVar++);
        };
        numInput1.getNum(4);

        //local variable
        int localVar = 5;
        NumInput numInput2 = (p)->{
            //following increment on localVar is not allowed
            //int val = p + localVar++;
            int val = p + localVar;
            System.out.println(val);
        };
        numInput2.getNum(3);




    }
}
