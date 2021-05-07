/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author techcare
 */
public class TreeSetExample {
    public static void main(String[] args) 
    { 
        TreeSet<String> ts1 = new TreeSet<String>(); 
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C");
        ts1.add("C");
        System.out.println("TreeSet is " + ts1);
        System.out.println("Phần tử cuối cùng trong mảng ts1 : " + ts1.last());
        ts1.remove("A");
        System.out.println("update ts1 : ");
        Iterator<String> itr = ts1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
}
}
