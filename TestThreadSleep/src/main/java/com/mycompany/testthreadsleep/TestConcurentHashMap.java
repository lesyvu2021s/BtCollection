/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author techcare
 */
public class TestConcurentHashMap {
        public static void main(String[] args) {
            ConcurrentHashMap<String , Integer> animals = new ConcurrentHashMap<String , Integer>(10 , 0.8f );
            animals.put("Pig", 2);
            animals.put("Dog", 3);
            System.out.println(animals);
            ConcurrentHashMap<String , Integer> animals2 = new ConcurrentHashMap<String , Integer>();
            animals2.put("Bird", 5);
            animals2.put("Cat", 4);
            System.out.println("Sau khi PutAll ");
            animals.putAll(animals2);
            System.out.println(animals);
            animals.putIfAbsent("Snake ", 6);
            System.out.println(animals);
            animals.forEach(4 , (k,v)-> k,(k) -> System.out.println(k + " "));
            String a1 = animals.search(2 ,(k,v) -> {return v == 2 ? k : null;});
            System.out.println("động vật có tuổi = 1 là : " + a1);
            int a2 = animals.reduce(4, (k,v) -> v  ,(v1,v2) -> v1 + v2 );
            System.out.println(a2);
    }
}
