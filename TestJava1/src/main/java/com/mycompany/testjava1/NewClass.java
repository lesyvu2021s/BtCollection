/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testjava1;

/**
 *
 * @author techcare
 */
public abstract class NewClass {
    abstract void a();
}

class B extends NewClass{

    @Override
    void a() {
        System.out.println("aKJVjsdVJ");
    }
    
    public static void main(String[] args) {
        B b = new B();
        b.a();
    }

}
