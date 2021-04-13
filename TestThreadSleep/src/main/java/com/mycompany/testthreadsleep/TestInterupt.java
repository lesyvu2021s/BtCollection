/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

/**
 *
 * @author techcare
 */
public class TestInterupt extends Thread{

    @Override
    public void run() {
       try{
           Thread.sleep(500);
       }catch(InterruptedException e ){
           System.out.println("Exception handled " + e );   
        // throw new RuntimeException("Thread Interupt ... " + e );
           
       }
        System.out.println("Thread Running ...");
    }
    
  
}
