/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.streamexample;

import static com.mycompany.streamexample.SequentialStream.createDummyData;
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
       List<String> values = createDummyData();
 
        long startTime = System.nanoTime();
 
        long count = values.parallelStream().sorted().count();
        System.out.println(count);
 
        long endTime = System.nanoTime();
 
        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
 
        System.out.println(String.format("sắp xếp song song  : %d ms", millis));
        
        
                }

   public static List<String> createDummyData() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;
    }
    
}
