/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author techcare
 */
public class TestProduct {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Bird", 25000));
        list.add(new Product(2, "Cat", 10000));
        list.add(new Product(3, "Crow",300000 ));
        list.add(new Product(4, "Dog", 15000));
        
        Stream<Product> fillterData = list.stream().filter(p -> p.price > 20000);
        fillterData.forEach(Product  -> System.out.println(Product.name + " :  " + Product.price));
    }
}
