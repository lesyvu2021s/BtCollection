/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplestreamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author techcare
 */
public class StreamExample2 {
    public static void streamFromCollection() {
     List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
 
        items.stream().forEach(item -> System.out.println(item));
}
    public static void getCollectionUsingStreamCollection() {
        Stream<String> stream = Stream.of("Crow", "Pig Bird ", "Cat", "Dog", "");
        List<String> languages = stream.collect(Collectors.toList());
        System.out.println(languages);
    }
    public static void main(String[] args) {
      //  streamFromCollection();
      getCollectionUsingStreamCollection();
    }
}
