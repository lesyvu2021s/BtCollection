/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author techcare
 */
public class BtCallab {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> list = new ArrayList<>();
        for(int i=0 ; i< 10 ; i++){
            Calculator cal = new Calculator(i, i + 1 );
            Future f =  executor.submit(cal);
           
            list.add(f);
            
        }
        for(Future f1 : list){
            System.out.println(f1.get(1, TimeUnit.SECONDS));
            System.out.println("is completed? : " + f1.isDone());
            System.out.println("is canceled? : " + f1.isCancelled());
        }
        
        executor.shutdown();
        while(!executor.isTerminated()){
            
        }
    }
}
