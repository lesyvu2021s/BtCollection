/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplestreamapi;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 *
 * @author techcare
 */
public class ParallelExample {
    public static void main(String[] args) {
//        long startTime = System.nanoTime();
//        System.out.println("Normal : ");
//        IntStream range = IntStream.rangeClosed(1, 10);
//        range.forEach(System.out::println);
//        long endTime = System.nanoTime();
//        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
//        System.out.println(String.format("sequential sort took: %d ms", millis));
//        
        long startTime2 = System.nanoTime();
        System.out.println("Parallel : ");
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);
        long endTime2 = System.nanoTime();
        long millis2 = TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2);
        System.out.println(String.format("parallel sort took: %d ms", millis2));
        
    }
}
