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
public class ThreadInterupt {
      public static void main(String[] args) {
        TestInterupt ti = new TestInterupt();
        
        ti.start();
        ti.interrupt();
    }
}
