/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author techcare
 */
public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i =0 ; i< 100 ; i++){
            executor.execute(new RequestHandler("Request - " + i ));
        }
        executor.shutdown();
        while (!executor.isTerminated()) {            
            
        }
    }
}
