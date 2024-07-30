package threads.interprocessComm.ex1;


public class ThreadA {
     public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        b.join();


        System.out.println(b.total);
    }

}
