package org.example;

public interface B extends A{

    default void display(){
        System.out.println("from B");
    }
}
