/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import javax.xml.catalog.Catalog;

/**
 *
 * @author techcare
 */
public class ReportBuyTimesPerViews {
    final static int TIME_TO_GET_BUY_TIMES = 5000;
    final static int TIME_TO_GET_VIEWS =5000;
    final static int TIME_TO_COMPUTE =5000;
    final static int VIEWS = 1000;
    final static int BUY_TIMES = 69 ;
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("start process ... ");
        long timeStart = System.currentTimeMillis();
        
        CompletableFuture<Integer> getBuyTime = 
    CompletableFuture.supplyAsync(() -> {
        exute("getBuyTimes" , TIME_TO_GET_BUY_TIMES);
        return BUY_TIMES ;
    });
        CompletableFuture<Integer> getViews = CompletableFuture.supplyAsync(() -> {
            exute("getViews", TIME_TO_GET_VIEWS);
            return VIEWS ; 
            
        });
        CompletableFuture<Double> ComputeBuyTimesPerView = getBuyTime 
                .thenCombine(getViews, (buyTime , views) ->{
                    exute("ComputeBuyTimesPerView", TIME_TO_GET_VIEWS);
                    return (double) buyTime/views ;
                });
        double result = ComputeBuyTimesPerView.get();
        System.out.println("tỷ lệ : " + result );
        System.out.println("hoàn thành process trong : " + (System.currentTimeMillis() - timeStart + "ms"));
        
}

    private static void exute(String name , int time ) {
        try{
            Thread.sleep(3000);
            System.out.println("Done task : " + name );
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
           
        }
    }
