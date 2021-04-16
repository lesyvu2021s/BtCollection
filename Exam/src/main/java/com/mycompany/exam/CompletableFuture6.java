/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author techcare
 */
public class CompletableFuture6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        CompletableFuture<Double> flattened = Util.getBooksDetails("1")
                .thenCompose(book -> Util.getCredit(book));
        System.out.println(flattened.get());
}
}
