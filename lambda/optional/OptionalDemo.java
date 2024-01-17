package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String email = "test@gmail.com";
        //of, empty, ofNullable


        //of you use when you are sure the object you are passing is not null
        Optional<Object> optional = Optional.of(email);
        System.out.println(optional);

        //use this to check to check if the object is empty. if empty, it will presend Optional.empty as result. No nullpointerexception
        Optional<Object> optional1 = Optional.empty();
        System.out.println(optional1);

        //use this to check if the value is null or not and avoid nullpointerexception; if null, will give empty and if not null, then give the value
        Optional<Object> optional2 = Optional.ofNullable(email);
        System.out.println(optional2.get());

        //orElse Method
        Optional<String> optionalOrElse = Optional.ofNullable(email);
        String defaultValue = optionalOrElse.orElse("default@gmail.com");
        System.out.println(optionalOrElse); //will print default  if email is null, else will print the email value


    }
}
