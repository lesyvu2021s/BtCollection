/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author techcare
 */
public class TestCompletableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException{
        ExecutorService executor = Executors.newFixedThreadPool(10);
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> Calculator2.add(1, 1) , executor);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> Calculator2.add(1, 2), executor);
        CompletableFuture<Integer> f3 = CompletableFuture.supplyAsync(() ->Calculator2.add(1, 3), executor);
        f3.get(1,TimeUnit.SECONDS);
        System.out.println("Done!");
        executor.shutdown();
        
        f1.thenRun(() ->{
            System.out.println("future 1 complete !" ); 
        });
        f2.thenAccept(sum -> {
            System.out.println("future 2 complete , sum = " + sum);
    });
        
        
        
        
    }
}
