/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import static java.util.Arrays.stream;
import java.util.stream.Stream;


/**
 *
 * @author techcare
 */
public class ExampleTakeWhile {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
        .takeWhile(i -> i<6)
        .forEach(System.out::println);
        
        Stream.of(1,2,3,4,5,6,7,8,9)
                .dropWhile(i -> i< 5)
                .forEach(System.out::println);
        
    }
}
