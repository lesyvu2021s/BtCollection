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
public class Test extends Thread{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e ){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
   /* public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        
        t1.start();
        try{
            t1.join(1500 );
        }catch(InterruptedException e ){
            System.out.println(e );
        }
        t2.start();
        t3.start();
    }*/
}
