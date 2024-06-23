package threads;

import java.lang.*;

public class SimpleThread implements Runnable {



    public  void run() {

        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+" -- "+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }

    }
}
