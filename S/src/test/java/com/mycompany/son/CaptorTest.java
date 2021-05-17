/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.son;

import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author techcare
 */
@RunWith(MockitoJUnitRunner.class)
public class CaptorTest {
    
    @Mock
    List<Object> list ; 
    
    @Captor
    ArgumentCaptor<Object> captor ; 
    
    @Test
    public void testCaptor1(){
        list.add(1);
        
        Mockito.verify(list).add(captor.capture());
        
        System.out.println(captor.getAllValues());
        
        Assertions.assertEquals(1,captor.getValue());
    }
    
}
