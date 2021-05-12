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
public class KiemTraSoNguyenToTest {
    KiemTraSoNguyenTo kt ;
    public KiemTraSoNguyenToTest() {
    kt = new KiemTraSoNguyenTo();
    }

    @Test
    public void testKtSoNT1() {
       boolean rs =kt.KtSoNT(-1);
        assertFalse(rs);
    }
    @Test
    public void testKtSoNT2() {
        boolean rs = kt.KtSoNT(0);
        assertFalse(rs);
    }
    @Test
    public void testKtSoNT3() {
        boolean rs = kt.KtSoNT(1);
        assertFalse(rs);
        
    }
    @Test
    public void testKtSoNT4() {
        boolean rs = kt.KtSoNT(2);
            assertTrue(rs);
    
    }
    @Test
    public void testKtSoNT5() {
        boolean rs = kt.KtSoNT(4);
        assertFalse(rs);
    }
    @Test
    public void testKtSoNT6() {
        boolean rs =kt.KtSoNT(5);
        assertTrue(rs);
    }
    
    
    
    
}
