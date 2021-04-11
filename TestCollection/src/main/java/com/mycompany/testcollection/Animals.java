/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcollection;

/**
 *
 * @author techcare
 */
public class Animals implements Comparable<Animals>{
    private String name ; 
    private int age ;
    private String address ;

    public Animals(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Animals{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }

    
    @Override
    public int compareTo(Animals t) {
        return this.getName().compareTo(t.getName());
    }

   
}
