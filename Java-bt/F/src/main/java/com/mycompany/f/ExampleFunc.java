/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.f;

/**
 *
 * @author techcare
 */
@FunctionalInterface
public interface ExampleFunc {
    
    void doSomeThing();
    
    default void doSomeThing1(){
        
    }
    static void doSomeThing2(){
        
    }
}
