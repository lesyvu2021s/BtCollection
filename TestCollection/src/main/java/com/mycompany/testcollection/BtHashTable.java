/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author techcare
 */
public class BtHashTable {
    public static void main(String[] args) {
        Hashtable<Integer , String > ht = new Hashtable<Integer, String >();
        ht.put(1, "Dog");
        ht.put(2, "Pig");
        ht.put(3, "Cat");
        
        show(ht);
        ht.remove(3);
        System.out.println("update...");
        show(ht);
    
    }
    public static  void show(Hashtable<Integer,String>  ht){
        Set<Integer> set  = ht.keySet();
        for(Integer key : set ){
            System.out.println(key + " :  " + ht.get(key) );
        }
    }
}
