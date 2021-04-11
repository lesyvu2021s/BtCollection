/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacebt;

/**
 *
 * @author techcare
 */
public class T implements OneOne , TwoTwo , FourFour{

    @Override
    public void print() {
        System.out.println("Hello Goodbye");
    }
    public static void main(String[] args) {
        T t = new T();
        t.print();
        t.show();
    }

    @Override
    public void show() {
        System.out.println("interface lồng nhau ");
    }
}
