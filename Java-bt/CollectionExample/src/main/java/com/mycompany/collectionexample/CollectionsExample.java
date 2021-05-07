/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author techcare
 */
public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(20);
        list.add(50);
        
        System.out.println(list);
        
        Integer[] numbers = {30 , 40 };
        Collections.addAll(list, numbers);
        System.out.println(list);
        System.out.println("số lớn nhất trong mảng :  " + Collections.max(list) );
        System.out.println("số nhỏ nhất trong mảng : " + Collections.min(list));
        
        System.out.println("đảo ngược : ");
        Collections.sort(list,Collections.reverseOrder());
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
