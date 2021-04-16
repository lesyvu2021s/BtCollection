/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 *
 * @author techcare
 */
public class completeOnTimeout {
    public static void main(String[] args) throws InterruptedException {
        int a = 3 ; 
        int b = 2 ;
        
        CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                try{
                    TimeUnit.SECONDS.sleep(3);
                }catch(InterruptedException e ){
                    e.printStackTrace();
                }
                return a+b;
            }
        })
        .completeOnTimeout(0, 1, TimeUnit.SECONDS)
        .thenAccept(result -> System.out.println(result));
        TimeUnit.SECONDS.sleep(10);
        
        
}
}
