/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author techcare
 */
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

       // them phan tu vao array list
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       list.add("E");
       list.add("F");
       
       System.out.println("Danh sach n: ");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
        }
        // sửa các phần tử được lặp 
        ListIterator<String> litr = list.listIterator();
        while(litr.hasNext()){
            Object element = litr.next();
            litr.set(element + " , ");
        } 
        
        System.out.println("nội dung sau khi được sửa của list  ");
        itr = list.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
    }
        System.out.println("hiển thị nội dung phần tử ngược lại  : ");
        
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.println(element);
            
        }
        System.out.println("xóa phần tử C trng list : ");
        litr = list.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            if("C".equals(element.toString())){
                litr.remove();
            }
        
        }
        System.out.println("List sau khi xóa phần tử C : ");
        itr = list.iterator();
        while(itr.hasNext()){
            Object element =itr.next();
            System.out.println(element);
        }
        
}
}
