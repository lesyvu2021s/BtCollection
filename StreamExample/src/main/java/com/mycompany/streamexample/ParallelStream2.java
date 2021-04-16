/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author techcare
 */
public class ParallelStream2 {
    public static void main(String[] args) {
       
        List<String> values = createData() ;
        
        long startTime = System.nanoTime();
        long count =values.parallelStream().sorted().count();
        System.out.println(count);
        long endTime = System.nanoTime();
        long milis = TimeUnit.NANOSECONDS.toMillis(endTime -startTime);
        System.out.println("sử dụng parallelStream hết :   "+ milis + "ms");
        
        
                }

    private static List<String> createData() {
        int max = 1000000 ;
        List<String> values = new ArrayList<>(max);
        for(int i=0 ; i< max ; i++ ){
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values ;
    }
}
