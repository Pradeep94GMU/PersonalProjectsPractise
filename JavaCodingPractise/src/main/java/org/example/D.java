package org.example;

public class D implements B,C{

    public void display() {
        B.super.display();
        C.super.display();
    }
}
