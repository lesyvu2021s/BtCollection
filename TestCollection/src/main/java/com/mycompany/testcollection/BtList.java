/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author techcare
 */
public class BtList {
        public static void main(String[] args) {
            List<String> listA = new ArrayList<String >();
            listA.add("Pig ");
            listA.add("Dog ");
            listA.add("Cat ");
            listA.add("CHicken ");
            listA.add("Dog");
            System.out.println("phan tu ở index 3 là : " + listA.get(3 ));
            
            listA.add(1, "Bird ");
            ListIterator<String> li = listA.listIterator();
            System.out.println("các phần tử có trong mảng listA : ");
            while (li.hasNext()) {
                System.out.println(li.next());
                
            }
            System.out.println("duyệt các phần tử từ cuối về đầu : ");
            while(li.hasPrevious()){
                System.out.println(li.previous());
            }
            
    }
}
