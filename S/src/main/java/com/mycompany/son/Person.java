/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.son;

/**
 *
 * @author techcare
 */
public class Person {
    private String name ; 
    public int salary(){
        int soNgayLamViec = 20 ; 
        int luongMotNgay = 300000 ;
        int thanhTien = soNgayLamViec * luongMotNgay ;
        return thanhTien ;
    }

    public String getName() {
        return name;
    }
    
}
