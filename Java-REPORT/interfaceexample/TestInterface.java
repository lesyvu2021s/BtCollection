/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaceexample;

/**
 *
 * @author techcare
 */
public class TestInterface implements Printable, Showable{

    @Override
    public void print() {
        System.out.println("Bye!");
    }
    public static void main(String[] args) {
        TestInterface ti = new TestInterface();
        ti.print();
    }
    
}
