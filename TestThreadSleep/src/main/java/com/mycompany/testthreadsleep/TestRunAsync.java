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
public class TestRunAsync {
    final static int TIME_TO_UPDATE_STORAGE =5000;
    final static int TIME_TO_UPDATE_TELESALE = 5000 ;
    public static void main(String[] args) {
        System.out.println("start process ");
        long startTime = System.currentTimeMillis();
        CompletableFuture<Void> upadateAmountStorage = CompletableFuture.runAsync(()->{
            System.out.println("update is running in a other thread ");
            updateStorage(TIME_TO_UPDATE_STORAGE);
            System.out.println("done task 1 ! ");
            
        });
        
        System.out.println("update telesale is running ... in main thread ");
        updateTelesale(TIME_TO_UPDATE_TELESALE);
        System.out.println("hoàn thành process trong " + (System.currentTimeMillis() - startTime) + "ms" );
    }

    private static void updateStorage(int TIME_TO_UPDATE_STORAGE) {
        try{
            Thread.sleep(TIME_TO_UPDATE_STORAGE);
            System.out.println("đã giảm số lượng hàng hóa trong kho ");
        }catch(InterruptedException e ){
            throw  new IllegalStateException(e );
        }
    }

    private static void updateTelesale(int TIME_TO_UPDATE_TELESALE) {
        try{
           Thread.sleep(TIME_TO_UPDATE_TELESALE);
            System.out.println("đã cộng tiền thành công cho telesale");
            
        }catch(InterruptedException e ){
            throw  new IllegalStateException(e );
        }
    }
}
