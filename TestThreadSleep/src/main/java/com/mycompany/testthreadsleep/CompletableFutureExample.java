/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;

/**
 *
 * @author techcare
 */
public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException {
        
        Calculator cal = new Calculator(2, 3);
        CompletableFuture<Integer> f =CompletableFuture.supplyAsync(cal);
        
        
        f.thenAccept(result->{
            System.out.println(result);
        });
        
        System.out.println("end!");
        Thread.sleep(1000);
        
    }
}
