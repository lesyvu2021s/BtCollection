/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author techcare
 */
public class BtConsumer implements Runnable{
    protected BlockingQueue<String> demo = null ; 

    public BtConsumer(BlockingQueue<String> demo ) {
        this.demo = demo;
    }
    
    
    @Override
    public void run() {
        try{
            System.out.println(demo.take());
            System.out.println(demo.take());
            System.out.println(demo.take());
            
        }catch(InterruptedException e ){
            System.out.println(e);
        }
    }
    
}
