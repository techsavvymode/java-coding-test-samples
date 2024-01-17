package com.java.lambda.functional;

import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<String>{
//
//    @Override
//    public void accept(String input) {
//        System.out.println(input);
//    }
//}

public class ConsumerDemo {
    public static void main(String[] args) {
        //Consumer<String> consumerImpl = new ConsumerImpl();
        //consumerImpl.accept("Testing Here..");

        Consumer<String> consumerImpl1 = (inputs) -> System.out.println(inputs);
        consumerImpl1.accept("LambdaWay");

        Consumer<Integer> consumerNew = (i)->System.out.println(i);
        consumerNew.accept(24);



    }


}
