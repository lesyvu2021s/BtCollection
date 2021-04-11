/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author techcare
 */
public class MainBtLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<TestBtLinkedHashSet> set = new LinkedHashSet<TestBtLinkedHashSet>();
        TestBtLinkedHashSet tb = new TestBtLinkedHashSet("Dog", 1, "HN");
        TestBtLinkedHashSet tb1 = new TestBtLinkedHashSet("Pig", 2, "SG");
        TestBtLinkedHashSet tb2 = new TestBtLinkedHashSet("Bird", 1, "ĐN");
        
        set.add(tb);
        set.add(tb1);
        set.add(tb2);
        
        Iterator<TestBtLinkedHashSet> it = set.iterator();
        TestBtLinkedHashSet tbl ; 
        while(it.hasNext()){
            tbl = it.next();
            System.out.println(tbl.toString());
        }
        
    }
}
