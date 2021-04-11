/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractbt;

import java.util.ArrayList;

/**
 *
 * @author techcare
 */
public class PhoneBook extends BtAbstract{
    
        ArrayList<String> phoneList = new ArrayList<String>();

    @Override
    void insertPhone() {
        phoneList.add("lsv : 0123456789");
        phoneList.add("abc : 1215454564");
        phoneList.add("abc : 4564789975");
        phoneList.add("abc : 0147896535");
        
        System.out.println("các phần tử có trong list là : ");
        for(String str : phoneList){
            System.out.println(str );
        }
    }

    @Override
    void removePhone() {
        System.out.println("mảng trước khi xóa ");
        for(String str : phoneList){
            System.out.println(str );
    }
        phoneList.remove("abc : 1215454564");
        System.out.println("mảng sau khi xóa ");
        for(String str : phoneList){
            System.out.println(str );
    }
    }

    @Override
    void updatePhone() {
        System.out.println("list trước khi cập nhật: ");
        System.out.println(phoneList);
        phoneList.set(0, "lsv : 0000000000");
        System.out.println("list sau khi cập nhật ");
        for(String str : phoneList){
            System.out.println(str );
    }
    }

    @Override
    void searchPhone() {
        
    }

    @Override
    void sort() {
        
    }
    
    
    
    }
    

