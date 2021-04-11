/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.LinkedList;

/**
 *
 * @author techcare
 */
public class BtLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String >();
        ll.add("Dog");
        ll.add("Pig ");
        ll.add("Cat ");
        
        System.out.println(ll );
        System.out.println("sử dụng for :  ");
        for(String ll1 : ll ){
            System.out.println(ll1 );
        }
        ll.set(2, "Bird ");
        System.out.println("mảng sau khi cập nhật");
        for(String ll1 : ll ){
            System.out.println(ll1 );
        }
        ll.remove(2);
        System.out.println("mảng sau khi xóa phần tử :");
        for(String ll1 : ll ){
            System.out.println(ll1 );
        }
        

    }
   
    
}
