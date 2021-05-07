/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author techcare
 */
public class LinkedHashSetEx {
    public static void main(String[] args)  
    { 
        LinkedHashSet<String> linkedset =  new LinkedHashSet<String>(); 
        
        linkedset.add("A");   
        linkedset.add("B");   
        linkedset.add("C");   
        linkedset.add("D"); 
        linkedset.add("A"); 
        
        System.out.println("Size linkedSet : " + linkedset.size());
        System.out.println("kiểm tra A " + linkedset.contains("A"));
        System.out.println("xóa A khỏi mảng : " + linkedset.remove("A"));
        Iterator<String> itr = linkedset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
