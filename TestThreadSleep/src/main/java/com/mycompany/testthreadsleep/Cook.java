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
public class Cook {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> cookingMeat =new CompletableFuture<String>();
        CompletableFuture<String> cookingRice = cookingRice();
        
        System.out.println("làm bữa tối ");
        cookingMeat.complete(cookingMeat());
        String meat = cookingMeat.get();
        String rice =cookingRice.getNow("Gạo" );
        System.out.println("ăn tối với : " + meat + " và " + rice);
        
        
        
    }

    public  static CompletableFuture<String> cookingRice() {
        return CompletableFuture.supplyAsync(() -> {
           try{
               System.out.println("nấu cơm ");
               Thread.sleep(9000);
               System.out.println(" nấu cơm xong ");
               
           } catch(InterruptedException e ){
               e.printStackTrace();
           }
           return  "nấu cơm xong ";
        });
    }
    

    public  static String cookingMeat() {
        try{
            System.out.println("nấu thịt ");
            Thread.sleep(3000);
            System.out.println("nấu thịt xong ");
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
        return "Thịt nấu xong ";
        
    }

    
}
