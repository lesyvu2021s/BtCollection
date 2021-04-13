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
public class CustomerExample {
    int tongSTK = 800000;
    synchronized void RutTien(int tongSTK  ){
        System.out.println("Số tiền cần  rút  : ");
        if(this.tongSTK < tongSTK){
            System.out.println("Số dư tài khoản không đủ ");
            try{
                wait();
                
            }catch(Exception e ){
                System.out.println(e);
            }
        }
        this.tongSTK -=tongSTK ;
        System.out.println("vui lòng nhận lại tiền và hóa đơn ");
    }
    synchronized  void GuiTien(int tongSTK) {
        System.out.println("Số tiền cần gửi là : ");
        this.tongSTK += tongSTK ;
        System.out.println("Gửi tiền thành công ");
        notify();
    }
}
