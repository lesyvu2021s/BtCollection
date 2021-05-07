/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author techcare
 */
public class HashtableEx {
    public static void main(String[] args) {
        
        Hashtable<Integer,String> ht = new Hashtable<>();
        
        ht.put(1, "Dog");
        ht.put(2, "Cat");
        ht.put(3, "Pig");
        ht.put(4, "Crow");
        show(ht);
        ht.remove(1);
        System.out.println("update : ");
        show(ht);
                
                
                }
    public static void show(Hashtable<Integer,String> ht ){
        
        for(Map.Entry map : ht.entrySet()){
            System.out.println(map.getKey() + ":" + map.getValue());
        }
                }
}
