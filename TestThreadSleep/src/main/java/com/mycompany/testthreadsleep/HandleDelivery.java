/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author techcare
 */
public class HandleDelivery {
    final static Boolean READY_DELIVERY = true ;
    final static int TIME_TO_CHECK_READY_DELIVERY =5000;
    final static int TIME_TO_CALL_SHIPPER =5000;
    final static int TIME_TO_SEND_MASSAGE  = 5000 ;
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Start process ");
        long startTime = System.currentTimeMillis();
        
        CompletableFuture<Boolean> checkReadyDelivery = CompletableFuture.supplyAsync(() ->{
            excute("checkReadyDelivery",TIME_TO_CHECK_READY_DELIVERY);
            return READY_DELIVERY;
        });
        
        CompletableFuture<String> callShipper = checkReadyDelivery.thenApply(readyDelivery ->{
            if(readyDelivery){
                excute("callShipper", TIME_TO_CALL_SHIPPER);
                return "thành công ";
            }else {
                return "thất bại";
            }
             
        });
        CompletableFuture<Void> sendMessageCustomer = checkReadyDelivery.thenAccept(readyDelivery ->{
           if(readyDelivery){
               excute("sendMessageCustomer", TIME_TO_SEND_MASSAGE);
           } 
        });
        String status =callShipper.get();
        System.out.println("gọi shipper " + status);
        System.out.println("hoàn thành process trong : " + (System.currentTimeMillis() - startTime) + "ms");
        
    }

    private static void excute(String name , int time ) {
        try{
            Thread.sleep(time);
            System.out.println("done task : " + name );
        }catch(InterruptedException e ){
            throw  new IllegalStateException(e);
        }
    }
    
}
