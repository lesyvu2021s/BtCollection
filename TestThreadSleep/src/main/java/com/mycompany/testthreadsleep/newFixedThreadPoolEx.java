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
public class newFixedThreadPoolEx {
    public static void main(String[] args) {
        ExecutorService excutor = Executors.newFixedThreadPool(5);
        
        for (int i=0 ; i<100 ; i++){
            excutor.execute(new RequestHandler("Request - " + i  ));
        }
        excutor.shutdown();
        while (!excutor.isTerminated()) {
           
            
        }
    }
}
