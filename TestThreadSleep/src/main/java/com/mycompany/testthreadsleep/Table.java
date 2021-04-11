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
public class Table {
   synchronized void printTable(int n ){
        for(int i =1 ; i<=5 ; i++){
            System.out.println(n*i );
            try{
                Thread.sleep(100 );
            }catch(InterruptedException e ){
                System.out.println(e );
            }
        }
    }
}
class myThread1 extends Thread {
    Table t ; 

    public myThread1(Table t) {
        this.t = t;
    }
    
    public void run(){
        t.printTable(5);
    }
    
}
class myThread2 extends Thread {
    Table t ; 

    public myThread2(Table t) {
        this.t = t;
    }
    
    public void run(){
        t.printTable(100);
    }
    
}

