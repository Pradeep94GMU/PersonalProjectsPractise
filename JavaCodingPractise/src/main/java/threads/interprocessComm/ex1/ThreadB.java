package threads.interprocessComm.ex1;

public class ThreadB extends Thread{

    int total = 0;

    @Override
     public void run(){
        for(int i = 1; i <= 100; i++){
            total += i;
        }
        //this.notify();
    }


}
