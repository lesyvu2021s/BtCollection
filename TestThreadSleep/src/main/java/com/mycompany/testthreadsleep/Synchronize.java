/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author techcare
 */
public class Synchronize {
    private static boolean  stopRequested  ;
    
    private static synchronized void requestStop(){
        stopRequested = true ;
    }
    private static synchronized boolean stopRequested(){
        return stopRequested;
    }
    public static void stopThread() throws InterruptedException{
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0 ; 
                while (!stopRequested()) {
                  i++ ; 
                    
                }
            }
        });
        t1.start();
        
        TimeUnit.SECONDS.sleep(1);
        requestStop();
        
        
    }
    public static void main(String[] args) throws InterruptedException{
        stopThread();
    }
}
