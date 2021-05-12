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
public class PersonTest {
    
    public PersonTest() {
    }
    
  
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of salary method, of class Person.
     */
    @Test
    public void testSalary() {
      int expected = 6000000 ;
      Person person = new Person();
      int actual = person.salary();
        assertEquals(expected, actual);
    }

    /**
     * Test of getName method, of class Person.
     */

   @Test
    public void testSalary2() {
      int expected = 5980000 ;
      Person person = new Person();
      int actual = person.salary();
        assertEquals(expected, actual);
    }
    
}
