/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btlambdaexpression;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author techcare
 */
public class Person {
        private String name;
        private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static List<Person> getListPerson(){
            List<Person> list = new ArrayList<Person>();
            list.add(new Person("Bird", 5));
            list.add(new Person("Crow", 10));
            list.add(new Person("Dog", 2));
            return list;
        
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
      
        

}
