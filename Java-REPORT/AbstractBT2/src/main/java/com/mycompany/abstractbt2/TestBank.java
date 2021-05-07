/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractbt2;

/**
 *
 * @author techcare
 */
public class TestBank {
    public static void main(String[] args) {
        Bank b = new BIDV ();
        int interest = b.getRateOfInterest();
        System.out.println("ty le lai suat la : " + interest + "%");
    }
}
