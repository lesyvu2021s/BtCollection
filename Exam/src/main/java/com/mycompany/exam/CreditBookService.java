/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import java.util.concurrent.CompletableFuture;

/**
 *
 * @author techcare
 */
public class CreditBookService {
    public static Double getCreaditRating(Book book){
        return Double.parseDouble(book.bookId);
    }

  

   
}
