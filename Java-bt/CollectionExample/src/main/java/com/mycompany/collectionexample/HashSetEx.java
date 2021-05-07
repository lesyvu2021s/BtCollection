/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author techcare
 */
public class HashSetEx {
        public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        
        h.add("CAT");
        h.add("BIRD");
        h.add("DOG");
        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
            System.out.println("Kiểm tra xem có DOG trong mảng không ? " + h.contains("DOG"));
            System.out.println("Số lượng phần tử trong h là : " + h.size());
            h.remove("DOG");
            System.out.println("mảng sau khi xóa phần tử DOG  : ");
            for(String h2 : h ){
                System.out.println(h2);
            }
        
    }
       
}

