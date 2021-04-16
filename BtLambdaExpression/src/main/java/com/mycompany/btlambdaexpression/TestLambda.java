/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;

/**
 *
 * @author techcare
 */
public class TestLambda {
    public static void main(String[] args) {
         List<String> Animals = Arrays.asList("Dog ", "Cat ", "Bird" , "Crow");
    Collections.sort(Animals , ( a1 , a2 ) ->  a1.compareTo(a2)
    );
    for (String list : Animals ){
            System.out.println(list);
    
}
        System.out.println("-------------------------------------");
        System.out.println("không sử dụng biểu thực lambda ");
    Collections.sort(Animals, new Comparator<String>() {
             @Override
             public int compare(String t, String t1) {
                 return t.compareTo(t1);
             }
         });
        
         for(String  list2 : Animals){
             System.out.println(list2);
         }
         
         System.out.println("------------------------");
         Opera o = (a,b)-> (a+b);
         System.out.println(o.add(10, 90));
        System.out.println("--------------------------");
        Opera o2 = (a,b) -> {
            int sum = a+b ; 
            return sum;
        };
        System.out.println(o2.add(25, 25));
        
        System.out.println("--------------------------");
        System.out.println("sử dụng lambda với forEach ");
        Animals.forEach(n -> System.out.println(n));
        
        System.out.println("------------------------------");
        System.out.println("sử dụng lambda tạo Thread ");
        Runnable r = new Runnable(){
            public void run(){
                System.out.println("Runable 1 ");
            }
        };
        Runnable r2 = () ->System.out.println("Runalble 2 ");
        r.run();
        r2.run();
        
        
}
}
