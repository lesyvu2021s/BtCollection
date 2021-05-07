/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author techcare
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        
        pQueue.add("Cat");
        pQueue.add("Bird");
        pQueue.add("Crow");
        pQueue.add("Pig Bird ");
        pQueue.add("Dog");
        
        System.out.println("Phan tu dau tien:" + pQueue.peek());
        Iterator<String> list = pQueue.iterator();
        while(list.hasNext()){
            Object element = list.next();
            System.out.println(element);
        }
        pQueue.poll();
        System.out.println("Sau khi xoa phan tu dau tien");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());
      
        pQueue.remove("Dog");
        System.out.println("Sau khi xoa phan tu Dog :");
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());
        
    }
}
