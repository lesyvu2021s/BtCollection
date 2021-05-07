/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author techcare
 */
public class TestJavaCollection1 {
    public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>(); 
list.add("Ravi");
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

