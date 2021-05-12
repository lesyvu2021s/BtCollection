/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.son;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author techcare
 */
public class CalculatorTests {
      Calculator calculator = new Calculator();
    
    @Test
    void shouldReturn2When1Plus1(){
        assertEquals(2,calculator.add(1, 1));
        
    }
}
