/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author techcare
 */
public class CollectorsExample2 {
    public static void main(String[] args) {
        List<Animals> list = Arrays.asList(
                new Animals("Bird ", 5),
                new Animals("Cat", 3),
                new Animals("Crow", 6),
                new Animals("Bird ", 10)
        
        );
        
        Map<String , Integer> result = list.stream().collect(Collectors.toMap(Animals::getName , Animals::getAge,
                (s1 ,s2 ) -> (s1 > s2 ? s1 : s2 )));
        System.out.println("result " + result);
        
        System.out.println("--------------------------------");
        
        Map<String,Integer> result2 = list.stream().collect(Collectors.toMap(Animals::getName , Animals::getAge , 
                (s1,s2)-> (s1 > s2 ? s1 : s2 ), LinkedHashMap::new 
                ));
        System.out.println("result 2 :  " + result2);
        
        System.out.println("-------------------");
        
        List<String> list2 = Arrays.asList("Dog","Bird","Crow","Cat");
        String result3 =list2.stream().collect(Collectors.joining());
        System.out.println("result 3 : " + result3);
        String result4 = list2.stream().collect(Collectors.joining(" , ", "Top -" , "- Bottom" )); 
        System.out.println("result 4 : " + result4);
    }
}
