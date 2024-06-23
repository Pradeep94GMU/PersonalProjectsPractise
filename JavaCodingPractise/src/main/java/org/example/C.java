package org.example;

public interface C extends A{
    default void display(){
        System.out.println("From C");
    }
}
