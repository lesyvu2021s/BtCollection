/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examplestreamapi;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author techcare
 */
public class StreamExample1 {
    List<Integer> numbers = Arrays.asList(1 , 7 , 5 , 3 , 6 , 4,2);
    public void withoutStream(){
        long count = 0 ; 
        for(Integer n : numbers ){
            if(n % 2 == 0 ){
                count++ ;
            }
        }
        System.out.println("số phần tử  chẵn trong danh sách numbers là  : " + count);
    }
    public void withStream(){
        long count = numbers.stream().filter(n -> n%2 ==0 ).count();
        System.out.println("số phần tử  chẵn trong danh sách numbers là  : " + count);
    }
    public static void main(String[] args) {
       StreamExample1 se1 = new StreamExample1();
       se1.withoutStream();
       se1.withStream();
    }
}
