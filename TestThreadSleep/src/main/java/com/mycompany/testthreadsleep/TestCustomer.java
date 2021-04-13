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
public class TestCustomer {
    public static void main(String[] args) {
        CustomerExample ce = new CustomerExample();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                ce.RutTien(1000000);
            }
            
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                ce.GuiTien(500000);
            }
        
            
        };
        t2.start();
    }
}
