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
public class TestInterruptingThread3 extends Thread{

    @Override
    public void run() {
        for(int i = 1 ; i <= 2 ; i++){
            if(Thread.interrupted()){
                System.out.println("Thread bị gián đoạn ");
            }
            System.out.println("Thread hoạt động bình thường ");
        }
    }
    
    public static void main(String[] args) {
        TestInterruptingThread3 ti1 = new TestInterruptingThread3();
        TestInterruptingThread3 ti2 = new TestInterruptingThread3();
        
        ti1.start();
        ti1.interrupt();
        ti2.start();
    }
}
