/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author techcare
 */
public class ExampleT {
    public static void main(String[] args) throws InterruptedException {
        int a = 3 ; 
        int b = 7 ; 
        CompletableFuture.supplyAsync(()->{
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
            return a+b ;
        })
                .orTimeout(2, TimeUnit.SECONDS)
                .whenComplete((result ,exeption ) ->{
                    System.out.println(result);
                    if(exeption!=null)
                        exeption.printStackTrace();
                });
        TimeUnit.SECONDS.sleep(10);
            
    }
}
