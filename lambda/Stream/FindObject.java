package com.java.lambda.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FindObject {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Tesla A", 20000));
        products.add(new Product(2,"Tesla B", 20300));
        products.add(new Product(3,"Tesla C", 26000));

        List<Product> res = products.stream()
                .filter(x -> x.price>21000)
                .collect(Collectors.toList());

        List<String> collects = res.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println(collects);








    }

}
