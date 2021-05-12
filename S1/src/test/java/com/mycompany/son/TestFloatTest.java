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
public class TestFloatTest {
    
    public TestFloatTest() {
    }

    @Test
    public void testDivide() {
        float actual = 12 / 3.0001f;
        float expected = 4;
        assertEquals(expected, actual , 0.001f);
    }
    
}
