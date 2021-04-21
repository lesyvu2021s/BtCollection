/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author techcare
 */
public class FuntionalInterfaceAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tu" ,"Bao" , "Giờ","Không");
        
        //list.forEach(p  -> System.out.println(p));
        // sử dụng consumer 
        list.forEach(new java.util.function.Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        System.out.println("--------------------------------------");
        //sử dụng predicate lúc kiểm tra từng phần tử lúc xóa , sửa , lọc ,...
        //dùng với list , stream 
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(1);
        list1.add(0);
        list1.add(-2);
        list1.add(3);
        
        list1.removeIf(new java.util.function.Predicate<Integer>(){
            @Override
            public boolean test(Integer t) {
                return t < 0 ;
            }
            
        });
      //  list1.forEach(t -> System.out.println(t));
      
      //sử dụng Predicate với cú pháp Lambda Expression
      list1.removeIf(t -> t<1);
      list1.forEach(t -> System.out.println(t));
      
        System.out.println("-----------------------------------");
        
        Random random = new Random();
          Stream  stream = Stream.generate(() -> random.nextInt(10)).limit(5);
          stream.forEach(t -> System.out.println(t + " " ));
        
    }
    
    
    
}

