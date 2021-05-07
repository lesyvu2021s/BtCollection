/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author techcare
 */
public class TreeMapExample {
    public static void main(String[] args) {
        
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1, "H");
        map.put(2, "E");
        map.put(3, "N");
        map.put(4, "T");
        
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
                
                }
}
