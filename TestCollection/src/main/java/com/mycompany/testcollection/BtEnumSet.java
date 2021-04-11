/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author techcare
 */



 enum Days{
        thu2, thu3, thu4 ,thu5 , thu6 , thu7 , CN
    }
public class BtEnumSet {
   
      public static void main(String[] args) {
        Set<Days> set = EnumSet.of(Days.thu6, Days.thu7, Days.CN);
        Iterator<Days> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        
          System.out.println("AllOff :");
        Set<Days> set2 = EnumSet.allOf(Days.class);
        Iterator<Days> it2 = set2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
            
        }
          System.out.println("Cả tuần được nghỉ : ");
          Set<Days> set3 = EnumSet.noneOf(Days.class);
          Iterator<Days> it3 = set3.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
            
        }
        
          System.out.println("chỉ thứ 3 đến thứ 6 được nghỉ : ");
          Set<Days> set4 = EnumSet.range(Days.thu3, Days.thu6);
          
          Iterator<Days> it4 = set4.iterator();
        while (it4.hasNext()) {
            System.out.println(it4.next());
            
        }
        
         
       
        
        
        
    }
}
