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
public class ThreadSyschronized {
    public static void main(String[] args) {
        final TableSynchronized obj = new TableSynchronized();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                obj.printTable(5);
            }
            
        };
        
         Thread t2 = new Thread(){
            @Override
            public void run() {
                obj.printTable(100);
            }
            
        };   
        
        t1.start();
        t2.start();
    }
}
