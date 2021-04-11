/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Set;

/**
 *
 * @author techcare
 */
public class BtMap {
    public static void main(String[] args) {
        Map<Integer, String > set = new HashMap<Integer , String>();
        set.put(1, "Dog ");
        set.put(2, "Pig");
        set.put(3, "Cat");
        
        Set<Integer> set1 = set.keySet();
        for(Object key : set1 ){
            System.out.println(key + " :" + set.get(key));
        }
        
        Map set2 = new HashMap<>();
        set2.put("4", "Checken");
        
        set.putAll(set2);
        System.out.println("sử dụng map.Entry để truy cập các phần tử :");
        //sử dụng map.Entry để truy cập các phần tử 
        for(Map.Entry<Integer,String> entry : set.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());   
        }
        
        System.out.println("phần tử có key = 1 là : "+ set.get(1));
    }
    }
    
    

