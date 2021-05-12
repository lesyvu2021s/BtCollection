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
public class Person2 {
    private String firstName;  
    private String lastName;

    public Person2(String firstName, String lastName) {
        if(firstName ==null && lastName == null ){
            throw  new IllegalArgumentException("Không được để trống cả hai ");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName(){
        String first = (this.firstName != null) ? this.firstName : "?";
            String last = (this.lastName != null) ? this.lastName : "?"; 
        return first + last ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
        
}
