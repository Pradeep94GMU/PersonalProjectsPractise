package threads.interprocessComm.ex1;

public class ThreadB extends Thread{

    int total = 0;

    @Override
     public void run(){
        synchronized (this){
            System.out.println("Got the lock and performing the task..");
            for(int i = 1; i <= 100; i++){
                total += i;
            }

            this.notify();
            System.out.println("sending the notification to caller thread to use the updated data..");

        }

    }


}
