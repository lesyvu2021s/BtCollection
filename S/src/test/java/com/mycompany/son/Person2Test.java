/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.son;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author techcare
 */
public class Person2Test {
    
    public Person2Test() {
    }
    
 
   

    /**
     * Test of getFullName method, of class Person2.
     */
    @Test
    public void testGetFullName() {
        Person2 p = new Person2("Aidan ", "Burke");  
        assertEquals("Aidan Burke", p.getFullName());
    }

    /**
     * Test of getFirstName method, of class Person2.
     */
    @Test
    public void testNullInName(){
        Person2 p = new Person2(null, "Burke");  
        assertEquals("?Burke", p.getFullName());
//        Person2 p2 = new Person2("luffy" , null);
//        assertEquals( p2.getFullName(), "luffy? " );
        Person2 p3 = new Person2("Luffy",null);
        assertEquals("Luffy?",p3.getFullName());
    }

    /**
     * Test of getLastName method, of class Person2.
     */
 
    
}
