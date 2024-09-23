package threads.EVENODD;

public class OddPrint extends Thread {

    final Object lock;

    public OddPrint(Object lock) {
        this.lock = lock;
    }

    public void run(){

        synchronized (lock){
            for(int i = 1; i <= 10; i++){
                if(i % 2 != 0) {
                    System.out.println("Odd Threading Executing: " + i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            synchronized (lock){
                lock.notify();
            }
        }
    }
}
