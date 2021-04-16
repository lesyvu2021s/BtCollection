/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.awt.BorderLayout;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author techcare
 */
public class CallTaxi {
    final static int TIME_TO_CALL_A = 3000;
    final static int TIME_TO_CALL_B= 3500;
    final static int TIME_TO_CALL_C = 2000;
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Start process ... ");
        CompletableFuture<String> callA = CompletableFuture.supplyAsync(() -> {
            System.out.println("Gọi cho tài xế A ");
        try{
            Thread.sleep(TIME_TO_CALL_A);
        }catch(InterruptedException e ){
            throw  new IllegalStateException(e);
        }
        return "Tài xế A đã phản hồi " ;
    });
        CompletableFuture<String> callB = CompletableFuture.supplyAsync(()-> {
            System.out.println("Gọi cho tài xế B ");
            try{
                Thread.sleep(TIME_TO_CALL_B);
            }catch(InterruptedException e ){
                throw  new IllegalStateException(e);
            }
            return "Tài xế B đã phản hồi " ;
        });
        
        CompletableFuture<String> callC = CompletableFuture.supplyAsync(()-> {
            System.out.println("Gọi cho tài xế C ");
            try{
                Thread.sleep(TIME_TO_CALL_C);
            }catch(InterruptedException e ){
                throw  new IllegalStateException(e);
            }
            return "Tài xế C đã phản hồi " ;
        });
        
        CompletableFuture<Object>  anyOfFuture = CompletableFuture.anyOf(callA,callA,callC);
        System.out.println(anyOfFuture.get());
        
    }
}
