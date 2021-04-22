/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author techcare
 */
public class StreamMain {
    static List<String> places = new ArrayList<>();
    public static List getPlaces(){
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        
        return places;
    }
    public static void main(String[] args) {
        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");
        
        myPlaces.stream()
                .filter((p) -> p.startsWith("USA"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }
}
