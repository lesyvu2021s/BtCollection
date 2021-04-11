/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

/**
 *
 * @author techcare
 */
import java.util.Iterator;
import java.util.LinkedList;

public class BtIterator {
    public static void main(String[] args) {
        LinkedList<String > t1  = new LinkedList<String>();
        t1.add("dog ");
        t1.add("cat ");
        t1.add("chicken ");
        
        Iterator<String> it = t1.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
       

       
    }
}
