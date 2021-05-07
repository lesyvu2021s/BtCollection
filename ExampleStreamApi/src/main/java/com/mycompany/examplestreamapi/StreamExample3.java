/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplestreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author techcare
 */
public class StreamExample3 {
    public static void main(String[] args) {
//        Stream.iterate(1, count -> count +1 )
//                .filter(n -> n%3 == 0 )
//                .limit(5)
//                .forEach(System.out::println);

    List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
//            data.stream()
//                    .skip(1)
//                    .limit(3)
//                    .map(String::toUpperCase)
//                    .forEach(System.out::println);

            data.stream()
                    .sorted()
                    .forEach(System.out::println);
            data.stream()
                    .sorted((s1,s2) ->s1.length() - s2.length())
                    .forEach(System.out::println);
    }
}
