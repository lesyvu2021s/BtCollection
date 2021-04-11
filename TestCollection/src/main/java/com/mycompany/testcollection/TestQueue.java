/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author techcare
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(20);
        q.add(30);
        q.add(10);
        q.add(40);
        
        System.out.println(q);
        System.out.println("Xóa 1 phần tử trong q : " + q.remove());
        System.out.println("update lại q : " + q);
        System.out.println("poll(): "+q.poll());
        System.out.println("update lại q : " + q);
        System.out.println("Phần tử đầu tiên của q là : " + q.peek());
        
        System.out.println("--------------------------------------------------");
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);
        
        System.out.println("phần tử đầu tiên trong pq là : " + pq.peek());
        System.out.println("xóa phần tử trong pq : " + pq.poll());
        System.out.println("các phần tử trong pq là : " + pq );
        
      
        
    
    }
}
