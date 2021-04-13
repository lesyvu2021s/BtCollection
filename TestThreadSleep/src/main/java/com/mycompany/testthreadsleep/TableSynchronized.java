/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

/**
 *
 * @author techcare
 */
public class TableSynchronized {
    void printTable(int n){
        synchronized(this){
            for(int i=1 ; i<=5 ; i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(InterruptedException e ){
                    System.out.println(e);
                }
            }
        }
    }
}
