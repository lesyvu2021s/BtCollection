/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author techcare
 */
public class InvokeAnyExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Callable<Integer>> callables = new ArrayList<>();
        
        for(int i=0 ; i<10 ; i++){
            callables.add(new CallableWorker(i));
        }
        Integer result = executor.invokeAny(callables);
        System.out.println("kết quả : " + result);
    }
}
