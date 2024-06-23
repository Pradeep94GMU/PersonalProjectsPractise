package threads;

import java.lang.*;

public class MainThread {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        SimpleThread simpleThread = new SimpleThread();

        Thread thread1 = new Thread(simpleThread);
        Thread thread2 = new Thread(simpleThread);



        thread1.start();
        thread2.start();

    }


}
