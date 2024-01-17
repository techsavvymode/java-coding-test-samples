package com.java.lambda.methodRef;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferencesDemo {
    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addtion(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        //1. Method refernce to a static method
        Function<Integer, Double> function =(i)->Math.sqrt(i);
        System.out.println(function.apply(4));

        //using method references
        Function<Integer, Double> functionRef =Math::sqrt;
        System.out.println(functionRef.apply(9));

        //lambda expression
        BiFunction<Integer,Integer,Integer> biFunctionLambda = (a,b)->MethodReferencesDemo.addtion(a,b);
        System.out.println(biFunctionLambda.apply(2,6));

        //using method refrences
        BiFunction<Integer,Integer,Integer> biFunctionRef = MethodReferencesDemo::addtion;
        System.out.println(biFunctionRef.apply(3,9));

        //2. Method refrences to an instance method of an object
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();


        //lambda expression
        //Note make sure Printable method print and class method display must have same parameter and return type
        //then you can use below
        Printable printable = (msg) -> methodReferencesDemo.display(msg);
        printable.print("Hello Again");

        //using method refrences
        Printable printableRef = methodReferencesDemo::display;
        printableRef.print("Hello Again");

        //3. Reference to the instance method of an arbitrary object
        //Sometimes, we call a method of argument in the lambda expression.
        //In that case, we can use a method reference to call an instance
        //method of an arbitrary object of a specific type.

        Function<String, String> functionByLambda = (String input) -> input.toLowerCase();
        System.out.println(functionByLambda.apply("Testing Water!"));

        //method Ref
        Function<String, String> functionByMethodRef = String::toLowerCase;
        System.out.println(functionByMethodRef.apply("Testing Water!!!"));

        String[] strArray = {"A","B","C","d","a","e","i","o","u"};

        //using lambda (anonymous class)
        Arrays.sort(strArray, (s1,s2)->s1.compareToIgnoreCase(s2));

        //method
        Arrays.sort(strArray, String::compareToIgnoreCase);


        //4. reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");

        Function<List<String>, Set<String>> setFunction = (fruitlists) -> new HashSet<>(fruitlists);
        System.out.println(setFunction.apply(fruits));

        //ref Method
        Function<List<String>, Set<String>> setFunctionRefMethod = HashSet::new;
        System.out.println(setFunctionRefMethod.apply(fruits));






    }
}
