/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 *
 * @author techcare
 */
public class Calculator implements Supplier<Integer>{

    private int a  ; 
    private  int b ; 

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer get() {
        try{
            Thread.sleep(300);
            
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
        return a+b;
    }
    
    
    
   
    
}
