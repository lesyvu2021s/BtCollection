/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreadsleep;

/**
 *
 * @author techcare
 */
public class DeadLock {
    static class friend {
        private final String name ;

        public friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public void bow(friend bower  ){
            System.out.format(" %s : %s "  + " cúi chào trươcs tôi " , this.name ,bower.getName());
            bower.bowBack(this);
        }

        private void bowBack(friend bower ) {
           System.out.format(" %s : %s "  + " cúi chào trươcs tôi " , this.name ,bower.getName());
            bower.bowBack(this);
        }
    }
    public static void main(String[] args) {
        final friend alphore = new friend("alphore ");
        final friend garb  = new friend("garb");
        new Thread(new Runnable(){
            public void run(){
                alphore.bow(garb);
            }
        }).start();
        new Thread(new Runnable(){
            public void run(){
                garb.bow(alphore);
            }
        }).start();
        
        
    
    
}
}
