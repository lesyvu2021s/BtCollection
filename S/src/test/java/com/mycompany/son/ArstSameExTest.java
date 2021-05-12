/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.son;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author techcare
 */
public class ArstSameExTest {
    
    public ArstSameExTest() {
    }

    @Test
    public void testStringExample() {
        String expected = "hello";
        String actual =new String("hello");
        assertNotSame(expected, actual);
    }
     @Test
    public void testStringExample2() {
        String expected = "hello";
        String actual =new String("hello");
        assertSame(actual, actual);
    }
    
}
