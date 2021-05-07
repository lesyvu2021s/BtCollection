/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author techcare
 */
public class MapInterfaceEx {
    public static void main(String[] args) {
        // init map
        Map<Integer,String>  map = new HashMap<>();
        map.put(1, "Một");
        map.put(2, "Hai");
        map.put(3, "Ba");
        
        Set set = map.keySet();
        for(Object key : set ){
            System.out.println(key + " " + map.get(key));
        }
        
        System.out.println("sử dụng Map.Entry");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("comparingByKey()");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        
    }
}
