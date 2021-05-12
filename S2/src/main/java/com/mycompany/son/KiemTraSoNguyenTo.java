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
public class KiemTraSoNguyenTo {
    
    public boolean KtSoNT(int n ){
        if(n < 2 ){
            return false ;
        }
        for(int i=2 ; i<n ; i++){
            if(n % i==0)
                return false;
        }
        return true ;
    }
}
