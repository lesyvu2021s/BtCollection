/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author techcare
 */
public class Rating {
    private double  points ;
    private List<Review> reviews = new ArrayList<>();
    
    public void add(Review review ){
        reviews.add(review);
        computeRating();
        
    }

    private double computeRating() {
        double totalPoints = reviews.stream().map(Review::getPoints)
                .reduce(0, Integer::sum);
        this.points =totalPoints / reviews.size();
        return this.points ;
    }
    public static Rating average(Rating r1 , Rating r2 ){
        Rating combined  = new Rating();
        combined.reviews=new ArrayList<>(r1.reviews);
        combined.reviews.addAll(r2.reviews);
        combined.computeRating();
        return combined;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    
    
    
}
