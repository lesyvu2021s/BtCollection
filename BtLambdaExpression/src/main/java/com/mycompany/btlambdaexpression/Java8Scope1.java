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
//truy cập sử dụng biến cục bộ 

public class Java8Scope1 {
   
       public static void doSomeThing1(){
        final int num = 1 ; 
        Converter<Integer,String> stringConverter =(from) ->String.valueOf(from + num);
        
       // stringConverter.convert(2);
           System.out.println(stringConverter.convert(2));
    }  
       public static void doSomething2() {
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
 
        //stringConverter.convert(2); // 3
        System.out.println(stringConverter.convert(2));
    }
 
    public static void doSomething3() {
        int num = 2;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
 
        //stringConverter.convert(3);
        System.out.println(stringConverter.convert(3));
                
        
    }
       
       public static void main(String[] args) {
        doSomeThing1();
        doSomething2();
        doSomething3();
         
    }
       
      
      
    
}
