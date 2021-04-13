/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author techcare
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> demo = new ArrayBlockingQueue<String>(1024);
        BtProducerCons producer = new BtProducerCons(demo);
        BtConsumer consumer = new BtConsumer(demo);
        new Thread(producer).start();
        new Thread(consumer).start();
        
       Thread.sleep(1234);
        
    }
    
  
    

}
    


