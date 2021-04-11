/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author techcare
 */
public class BtSet {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<String> ();
        setA.add("Dog" );
        setA.add("Cat ");
        setA.add("Chicken ");
        setA.add("Dog");
        
        System.out.println("so phan tu co trong setA : " + setA.size() );
        System.out.println("cac phan tu cua setA : " + setA );
        System.out.println("Dog co trong setA ? " + setA.contains("Dog"));
        
        Set<String> setB = new HashSet<String> ();
        setB.add("Pig ");
        setA.addAll(setB);
        System.out.println("so phan tu co trong setA : " + setA.size() );
        System.out.println("cac phan tu cua setA : " + setA );
        
        
        Iterator<String> it =setA.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        System.out.println("sử dụng foreach :");
        for (String setAA : setA ){
            System.out.println(setAA );
        }
        setA.remove("Dog");
        System.out.println("sau khi xóa phần tử trong setA  :");
        for (String setAA : setA ){
            System.out.println(setAA );
        }
        System.out.println("SetA có trống không ? " + setA.isEmpty() );
        
        ArrayList<String> listA = new ArrayList<String >();
        listA.addAll(setA );
        System.out.println("mang listA " + listA);
    }
    
    
    
    
}
