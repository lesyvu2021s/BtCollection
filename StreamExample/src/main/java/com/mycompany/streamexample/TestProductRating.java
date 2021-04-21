/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author techcare
 */
public class TestProductRating {
    public static void main(String[] args) {
        Product a = new Product("Product A", 30);
        a.getRating().add(new Review(5, ""));
        a.getRating().add(new Review(3, "not bad"));
        Product b = new Product("Product A", 100);
        b.getRating().add(new Review(4, "great!"));
        b.getRating().add(new Review(2, "terrible experience"));
        b.getRating().add(new Review(4, ""));
        List<Product> products = Arrays.asList(a, b);
        Rating averageRating = products.stream()
                .reduce(new Rating(), (rating, user) -> Rating.average(rating, user.getRating()), 
                        Rating::average);
        System.out.println("Point: " + averageRating.getPoints());
    }
}
