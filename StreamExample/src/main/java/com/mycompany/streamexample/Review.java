/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

/**
 *
 * @author techcare
 */
public class Review {
    private int points  ;
    private String review ;

    public Review(int points, String review) {
        this.points = points;
        this.review = review;
    }

    public Review() {
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
    
}
