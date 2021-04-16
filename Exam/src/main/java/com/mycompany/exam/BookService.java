/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

/**
 *
 * @author techcare
 */
public class BookService {
    public static Book getBookDetails(String bookId ){
        return new Book(bookId);
    }
}
