package com.java.lambda;

interface Shape{
    void draw();
}

//class Rectangle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle");
//    }
//}
public class LambdaExamples {
    public static void main(String[] args) {
        Shape shape = () -> System.out.println("Circle");
        shape.draw();


        lambdaPrint(() -> System.out.println("Circles..."));

        lambdaPrint(()-> System.out.println("Rectangles..."));

    }

    private static void lambdaPrint(Shape shape){
        shape.draw();
    }


}
