/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.son;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;



/**
 *
 * @author techcare
 */
@RunWith(MockitoJUnitRunner.class)
public class SpyTest {
    @Spy
    List<String > list =new ArrayList<>();
    
    @Test 
    public void testSpy(){
        list.add("one");
        list.add("two");
        
        System.out.println(list);
        
        Mockito.verify(list).add("one");
        Mockito.verify(list).add("two");
        
        Assertions.assertEquals(2,list.size());
        
        Mockito.when(list.size()).thenReturn(100);
        Assertions.assertEquals(100,list.size());
        
    }
}
