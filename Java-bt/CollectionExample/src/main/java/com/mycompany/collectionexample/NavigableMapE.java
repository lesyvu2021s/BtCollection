/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author techcare
 */
public class NavigableMapE {
    public static void main(String[] args) {
        NavigableMap<Integer , String > nm = new TreeMap<Integer, String>();
        
      nm.put(100,"Amit");    
      nm.put(102,"Ravi");    
      nm.put(101,"Vijay");    
      nm.put(103,"Rahul");   
        
      //  System.out.println("các giá trị giảm dần  : " + nm.descendingKeySet());
      System.out.println("các giá trị giảm dần  : " + nm.descendingMap());
       // System.out.println("các giá trị nhỏ hơn 102 là : " + nm.headMap(102));
        System.out.println("các giá trị nhỏ hơn 102 là : " + nm.headMap(102,true ));
        System.out.println("các giá trị lớn hơn 102 là : " + nm.tailMap(102));
    }
}
