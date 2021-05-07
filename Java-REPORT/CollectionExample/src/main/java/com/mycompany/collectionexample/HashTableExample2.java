/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author techcare
 */
public class HashTableExample2 {
    public static void main(String[] args) {
        Hashtable<String , Student> ht = new Hashtable<String , Student>();
        ht.put("1", new Student("A", 12, "Hanoi"));
        ht.put("3", new Student("C", 13, "Hanoi"));
        ht.put("2", new Student("E", 15, "Hanoi"));
        ht.put("4", new Student("D", 14, "Hanoi"));
        show(ht);
    }
    public static void show(Hashtable<String , Student> ht ){
        
        for(Map.Entry map : ht.entrySet()){
            String key = (String) map.getKey();
            Student st = (Student) map.getValue();
            System.out.println(key + " : ");
            System.out.println(st.toString());
        }
    }
}
