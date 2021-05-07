/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionexample;


import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author techcare
 */
public class TreeMapExample2 {
    public static void main(String[] args) {
        Map<Integer,Book> map = new TreeMap<Integer, Book>();
        Book b1 = new Book(100, "aaaaa", "bbbbbb", "ccccc", 1000);
        Book b2 = new Book(101, "sssss", "dddddd", "fffff",2000);
        Book b3 = new Book(102, "mmmmm", "nnnnnn", "hhhhh", 3000);
        
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        
        for(Map.Entry m : map.entrySet()){
            int key = (int) m.getKey();
            Book b = (Book) m.getValue();
            System.out.println(key + " details :  "  );
            System.out.println(b.id + b.name + b.author + b.publisher +b.quantity);
        }
        
    }
}
