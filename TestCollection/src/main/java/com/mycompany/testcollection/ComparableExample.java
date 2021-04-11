/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author techcare
 */
public class ComparableExample {
    public static void main(String[] args) {
         List<Animals> list1 = new ArrayList<Animals>();
         list1.add(new Animals("Pig", 1, "HN"));
         list1.add(new Animals("Cat", 3, "SG" ));
         list1.add(new Animals("Bird", 2, "ĐN"));
         
         Collections.sort(list1);
         for(Animals a : list1){
             System.out.println(a);
         }
         System.out.println("Cách 2 : ");
         Collections.sort(list1, new Comparator<Animals>() {
             @Override
             public int compare(Animals t, Animals t1) {
                 return t.getAge() > t1.getAge() ? -1 : 1 ;
             }
         });
        for(Animals a1 : list1 ){
            System.out.println(a1.toString());
        }
    
         
    }
    
  
    
   
}
