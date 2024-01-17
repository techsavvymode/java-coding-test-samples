package com.java.lambda.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = ()-> LocalDateTime.now();
        System.out.println(supplier.get());
    }

}
