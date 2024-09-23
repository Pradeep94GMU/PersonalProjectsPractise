package threads.interprocessComm.ex1;


public class ThreadA {
     public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b){
            System.out.println("Calling child thread and going to waiting state...");
            b.wait();
            System.out.println("got the notification...");
        }
        System.out.println(b.total);
    }

}
