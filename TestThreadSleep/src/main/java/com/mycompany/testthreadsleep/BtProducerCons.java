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
public class BtProducerCons implements Runnable{
    protected  BlockingQueue<String> demo = null ;

    public BtProducerCons(BlockingQueue<String> demo ) {
        this.demo = demo ;
    }
    
    @Override
    public void run() {
        try{
            demo.put("100");
            Thread.sleep(1000);
            demo.put("200");
            Thread.sleep(1000);
            demo.put("300");
        }catch(InterruptedException e ){
            System.out.println(e);
        }
    }
    
}
