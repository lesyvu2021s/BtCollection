/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/**
 *
 * @author techcare
 */
public class TestsupplyAsync {
    final static int TIME_TO_UPDATE_STORAGE =5000;
    final static int TIME_TO_UPDATE_TELESALE = 5000 ;

    private static void updateStorage(int time ) {
        try{
            Thread.sleep(time);
            System.out.println("Update hàng trong kho thành công ");
        }catch(InterruptedException e ){
            throw  new IllegalStateException(e );
        }
    }
    final static int amount = 0 ;
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Start process ");
        long timeStart = System.currentTimeMillis();
        CompletableFuture<Integer> UpdateAmountStorage = CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                System.out.println("update Storage is running in a other thread ");
                updateStorage(TIME_TO_UPDATE_STORAGE);
                
                return amount;
            }
        });
        System.out.println("update telesale is running in a main thread ");
        updateTelesale(TIME_TO_UPDATE_TELESALE);
        System.out.println("số lượng hành còn lại trong kho là : " + UpdateAmountStorage.get() );    
        System.out.println("thời gian hoàn thành process : " + (System.currentTimeMillis() - timeStart) + "ms ");
        
    }

    private static void updateTelesale(int time ) {
       try{
           Thread.sleep(time);
           System.out.println("đã cộng tiền cho telesale thành công ");
       }catch(InterruptedException e ){
           throw  new IllegalStateException(e );
       }
    }
}
