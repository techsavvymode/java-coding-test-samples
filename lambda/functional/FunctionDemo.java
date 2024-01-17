package com.java.lambda.functional;

import java.util.function.Function;

//class FunctionImpl implements Function<String, Integer>{
//
//    @Override
//    public Integer apply(String s) {
//        return s.length();
//    }
//}

public class FunctionDemo {

    public static void main(String[] args) {
//        Function<String, Integer> func = new FunctionImpl();
//        System.out.println(func.apply("Test"));

        Function<String, Integer> funcLambda = (s) -> s.length();
        System.out.println(funcLambda.apply("Testing"));
        }



}
