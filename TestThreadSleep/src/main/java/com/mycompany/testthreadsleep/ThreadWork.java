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
public class ThreadWork implements Runnable{
    private String message ; 

    public ThreadWork(String message) {
        this.message = message;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) message " + message );
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End)");
        
    }
    private void processMessage(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e ){
            System.out.println(e);
        }
    }
    
    
    
    
}
