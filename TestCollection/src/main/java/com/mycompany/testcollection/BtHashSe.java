/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author techcare
 */
public class BtHashSe {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Dog");
        hs.add("Bird");
        hs.add("Cat");
        hs.add("Pig");
        hs.add("Pig");
        
        System.out.println("số phần tử trong hs là : " + hs.size());
        System.out.println("các phần tử có trong hs  : " + hs);
        System.out.println("Dog có tồn tại trong mảng không ? " + hs.contains("Dog"));
        Set<String> setA = new HashSet<String>();
        setA.add("Chicken");
        hs.addAll(setA);
        System.out.println("các phần tử có trong hs  : " + hs); 
        Iterator<String> it = hs.iterator();
        //duyệt mảng bằng iterator
        System.out.println("duyệt mảng bằng iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        hs.remove("Cat");
        System.out.println("mảng sau khi xóa phần tử ");
        for(String hz : hs ){
            System.out.println(hz);
        }
        
        List<String> listA = new ArrayList<String>();
        listA.addAll(hs );
        System.out.println("mang sau khi chuyển thanh List ");
        System.out.println(listA);
        
        
        
        
        
                }
}
