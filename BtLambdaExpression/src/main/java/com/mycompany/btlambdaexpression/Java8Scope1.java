/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

/**
 *
 * @author techcare
 */
public class Java8Scope1 {
   
       public static void doSomeThing1(){
        final int num = 1 ; 
        Converter<Integer,String> stringConverter =(from) ->String.valueOf(from + num);
        
        stringConverter.convert(2);
    }  
      
      
    
}
