/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.ForkJoinWorkerThread;

/**
 *
 * @author techcare
 */
public class MutualExclusion implements Runnable{
    
    static int count = 0;

    public  void  add() {
            for(int i =0 ; i< 10 ; i++) 
                count ++;
    }

    @Override
    public void run() {
        add();
    }
    
    public static void main(String[] args) throws InterruptedException{
        MutualExclusion x = new MutualExclusion();
        /* for(int i = 0 ; i<500 ; i++){
            Thread t1 = new Thread(x);
            t1.start();
        } */ 
        Thread t2 = new Thread(x);
        t2.start();
        Thread.sleep(1000);
        System.out.println(x.count);
    }
}
