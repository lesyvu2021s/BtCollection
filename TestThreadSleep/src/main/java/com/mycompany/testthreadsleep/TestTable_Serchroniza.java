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
public class TestTable_Serchroniza {
    public static void main(String[] args) {
       /* Table t1 = new Table();
        myThread1 m1 = new myThread1(t1);
        myThread2 m2 = new myThread2(t1);
        m1.start();
        m2.start(); */
       
       Table t = new Table();
       Thread t1 = new Thread(){
           public void run(){
               t.printTable(5);
           }
           
       };
       Thread t2 = new Thread(){
         public void run(){
             t.printTable(100 );
         }  
       };
       
       t1.start();
       t2.start();
       
    }
}
