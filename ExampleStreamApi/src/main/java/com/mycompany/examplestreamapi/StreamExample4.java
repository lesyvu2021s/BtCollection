/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplestreamapi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author techcare
 */
public class StreamExample4 {
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        productsList.stream()
                    .filter(product -> product.price >28000 )
                    .forEach(product -> System.out.println(product.name));
        
        Float totalPrice =  productsList.stream()
                    .map(product -> product.price)
                    .reduce(0.0f, (sum,price)->sum+price);
        System.out.println("total price = " +totalPrice);
}
}
