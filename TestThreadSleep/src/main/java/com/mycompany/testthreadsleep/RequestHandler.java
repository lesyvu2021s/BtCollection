/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author techcare
 */
public class RequestHandler implements Runnable{
    String name ;

    public RequestHandler(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " bắt đầu xử lí " + name );
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " Kết thúc xử lí " + name );
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
    }
    
}
