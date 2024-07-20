package testing;

import java.io.IOException;

class A {
    void m1() throws ArrayIndexOutOfBoundsException {
        System.out.println("hello A");
    }
}

class B extends  A{
    void m1() throws IndexOutOfBoundsException{
        System.out.println("Hello B");
    }
}
public class Test {

    public static void main(String[] args) {



    }

}
