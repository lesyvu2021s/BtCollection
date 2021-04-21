/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author techcare
 */
public class TestDividerStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum  = " + sumOfDim(numbers, 1));
    }
    public static int sumOfDim(List<Integer> numbers , int Divider ){
        return numbers.stream()
                .reduce(0,(a,b) ->{
                    try{
                        return a/Divider + b/Divider ;
                    }catch(ArithmeticException e ){
                        System.out.println("ArithmeticException  : Divider by zero  ");
                    }
                    return 0 ;
                });
    }
}
