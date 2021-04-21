/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author techcare
 */
public class BtStream {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5,6)
                .stream()
                .map(i -> "Biến đổi từng phần tử thành String - " + i )
                .map(String::toUpperCase)
                .forEach(System.out::println);
        
        System.out.println("---------------------------------------------");
        
        IntStream.range(1, 1000).boxed()
                .filter( i -> i%2 !=0)
                .map(i ->"String - " + i )
                .map(String::toUpperCase)
                .limit(10)
                .sorted()
                .forEach(System.out::println);
             
        System.out.println("----------------------------------------------");
        System.out.println("xử lí song song ");
        
        List<String> result =IntStream.range(1, 1000).boxed()
                                       .parallel()
                                       .filter(i -> i % 2 ==0)
                                       .map( i -> "String - " + i )
                                       .map(String::toUpperCase)
                                       .limit(10)
                                       .sorted(Comparator.naturalOrder())
                                       .collect(Collectors.toList());
        System.out.println("Kết quả ");
        result.forEach(System.out::println);
        
        System.out.println("-------------------------------------------");
        List<String> result2 = Stream.of("tôi", "là" , "Siêu", "nhân")
                                .filter( s ->{
                                    System.out.println("[filtering ]" + s );
                                    return s.length()>=3 ;
                                })
                                .map(s -> {
                                    System.out.println("[mapping]" +s );
                                    return s.toUpperCase();
                                })
                                .limit(3)
                                .collect(Collectors.toList());
       
        System.out.println("result : ");
        result2.forEach(System.out::println);
        System.out.println("--------------------------------------");
        List<String> elements =Stream.of("a" , "b" , "c")
                                        .filter(element ->element.contains("b"))
                                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement =elements.stream().findFirst();
        
        System.out.println(anyElement);
        System.out.println(firstElement);
        
        
    }
}
