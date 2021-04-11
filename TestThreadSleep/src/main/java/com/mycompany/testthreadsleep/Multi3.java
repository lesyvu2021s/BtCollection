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
public class Multi3 implements Runnable{

    @Override
    public void run() {
        System.out.println("dang chay ...");
    }
    public static void main(String[] args) {
        Multi3 t3 = new Multi3();
        Thread t1 = new Thread(t3);
        t1.start();
    }

    
}
