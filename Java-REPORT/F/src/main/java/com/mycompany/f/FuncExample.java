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
public class FuncExample implements DemoFunctionalInterface {

    @Override
    public void doSomething(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FuncExample fe = new FuncExample();
        fe.doSomething("Xin chào ... tạm biệt");
        fe.doSomeThing1();
    }
   
}
