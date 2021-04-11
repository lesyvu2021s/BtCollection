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
public class ThreadGroupTest implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupTest tgt = new ThreadGroupTest();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
        Thread t1 = new Thread(tg1 , tgt ,"one ");
        t1.start();
        Thread t2 = new Thread(tg1 , tgt , "two ");
        t2.start();
        Thread t3 = new Thread(tg1 , tgt , "three  ");
        t3.start();
        System.out.println("ThreadGroup name  " + tg1.getName());
        tg1.list();
        
        
    }
    
}
