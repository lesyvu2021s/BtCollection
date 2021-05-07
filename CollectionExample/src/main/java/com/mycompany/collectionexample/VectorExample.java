/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author techcare
 */
public class VectorExample {
    public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
        System.out.println("Lấy phần tử thứ 2 trong mảng V : " + v.get(1));
        System.out.println("xóa phần tử thứ 3 trong mảng V : "  + v.remove(2));
        System.out.println("mảng sau khi xóa là : ");
        
       Iterator<String> itr2 = v.iterator();
        while (itr2.hasNext()) {
            Object element = itr2.next();
            System.out.println(element);
            
        }
}  
}
