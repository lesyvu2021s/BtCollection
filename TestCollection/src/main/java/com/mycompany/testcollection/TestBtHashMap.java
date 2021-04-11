/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author techcare
 */
public class TestBtHashMap {
    public static void main(String[] args) {
        HashMap<String , TestBtLinkedHashSet> animals = new HashMap<String , TestBtLinkedHashSet>();
        animals.put("1", new TestBtLinkedHashSet("Dog", 1, "HN"));
        animals.put("2", new TestBtLinkedHashSet("Pig", 2, "SG"));
        animals.put("3", new TestBtLinkedHashSet("Bird", 1, "ĐN"));
        
        for(Map.Entry<String,TestBtLinkedHashSet> entry : animals.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
