/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author techcare
 */
public class ArrayDequeExample {
public static void main(String[] args) {  
 
Deque<String> deque = new ArrayDeque<String>();  
deque.add("Cat");  
deque.add("Bird");  
deque.add("Dog");  
//Traversing elements  
for (String str : deque) {  
System.out.println(str);  
}
deque.addFirst("Crow");
System.out.println("mảng sau khi thêm phần tử vào vị trí đầu : ");
for (String str : deque) {  
System.out.println(str);  
}
            System.out.println("Phần tử đầu tiên  là : " + deque.getFirst());
            System.out.println("xóa phần tử cuối cùng : " + deque.removeLast());
            deque.push("Pig Bird ");
            System.out.println("sau khi thêm phần tử vào mảng bằng push ");
            Iterator<String> itr = deque.iterator();
            while (itr.hasNext()) {
                Object element = itr.next();
                System.out.println(element);
                
            }
}  
}
