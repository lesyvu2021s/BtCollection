/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author techcare
 */
public class TestStream {
   
    
    public static void main(String[] args) {
       
     IntStream.range(1, 4).forEach(System.out::println);
     DoubleStream.of(1,2,3).forEach(System.out::println);
     
        System.out.println("-------------------------------");
        System.out.println("các số chia hết cho 3 ");
     Stream.iterate(1, count -> count +1 )
            .filter(number -> number % 3 ==0 )
             .limit(6)
             .forEach(System.out::println);
     
     
        System.out.println("-----------------------------------");
        System.out.println("Stream limit() & skip() :  ");
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
        
        
        System.out.println("-----------------------------------");
        System.out.println("Stream map() :  ");
        List<String> data2 = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data2.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println(" collect() giúp thu thập kết quả Stream sang một Collection");
         Stream<String> data3 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> languages = data3.collect(Collectors.toList());
        System.out.println(languages);
        Boolean data4 = languages.stream().anyMatch(s -> s.equalsIgnoreCase("Java"));
        System.out.println(data4);
        
        System.out.println("--------------------------------------------");
        System.out.println(" sử dụng reduce ");
        int result = IntStream.of(1,2,3,4).reduce(0, (a,b) ->(a+b));
        System.out.println(result);
        
        System.out.println("----------------------------------------");
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result3 = letters.stream().reduce("", (subtotal , element) -> subtotal + element);
        System.out.println("result3 : " + result3);
        String result4 = letters.stream().reduce("", String::concat);
        System.out.println("sử dung concat , result4 : " + result4);
        
        System.out.println("------------------------------------");
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int result5 = ages.parallelStream().reduce(0, (a,b )->  a+b );
        System.out.println("kết quả result5 : " + result5);
        int result6 = ages.parallelStream().reduce(0, Integer::sum);
        System.out.println("kết quả result6 =  "+ result6);
        
        
    }
    
}
