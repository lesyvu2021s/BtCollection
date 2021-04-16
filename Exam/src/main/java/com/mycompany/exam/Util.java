/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 *
 * @author techcare
 */
public class Util {
    public static CompletableFuture<Book> getBooksDetails(String bookId) {

        return CompletableFuture.supplyAsync(() -> {
            return BookService.getBookDetails(bookId);
        });
        
    }
    public static CompletableFuture<Double> getCredit(Book book ){
        return CompletableFuture.supplyAsync(() -> {
            return CreditBookService.getCreaditRating(book);
        });
    }
}
