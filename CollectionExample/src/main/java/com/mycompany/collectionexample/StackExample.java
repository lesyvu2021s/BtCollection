/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author techcare
 */
public class StackExample {
    public static void main(String args[]){ 
    Stack<String> stack = new Stack<String>();  
stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");
stack.push("Garima");
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
        System.out.println("lấy phần tử đầu trong stack : " + stack.peek());
        System.out.println("xóa phần tử đầu trong stack  : " + stack.pop());
        System.out.println("kiểm tra stack trống hay không ? " + stack.empty());
        System.out.println("tìm kiếm Garima trong stack " + stack.search("Garima"));
        
        
}  
}
