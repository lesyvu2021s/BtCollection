/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author techcare
 */
public class TestOpera {
    public static void main(String[] args) {
        Opera o2 = (a , b )->{
            
            return a +b ;
            
        };
        System.out.println("a + b = " + o2.add(5 , 5));
        
        //không sử dụng return 
        Opera o3 = (a , b ) -> (a + b );
        System.out.println("a + b = " + o3.add(7, 6));
        
        List<String> list = new ArrayList<String>();
        list.add("Pig");
        list.add("Crow");
        list.add("Pig Bird");
        
        System.out.println("sử dụng foreach ");
        list.forEach((list2) -> {
            System.out.println(list2);
        });
        
        System.out.println("----------------------------");
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("Thread is running ...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        
        Runnable r2 = () -> {
            
                System.out.println("Thread2 is running ... ");
        };
        Thread t2 = new Thread(r2);
        t2.start();
        
        System.out.println("-------------------------------------------");
        System.out.println("sử dụng lambda trong collection ");
        List<Animals> list2 = new ArrayList<Animals>();
        list2.add(new Animals("Pig Bird ", 3, "Tree "));
        list2.add(new Animals("Dog ", 2, "House"));
        list2.add(new Animals("Crow", 3, "House"));
        
        
        System.out.println("sắp xếp các phần tử theo tên ");
        Collections.sort(list2 , (a1 , a2 )-> {
            return a1.name.compareTo(a2.name);
        });
        for(Animals a : list2 ){
            System.out.println( a.name + " " + a.age + " " + a.address );
        }
    }
   
}
