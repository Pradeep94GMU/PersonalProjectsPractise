package threads.Sharedvariaable;

public class ThreadCommon extends Thread{


    final SharedConter sharedConter;

    public ThreadCommon(SharedConter sharedConter) {
        this.sharedConter = sharedConter;
    }

    public void run(){

        for(int i = 0; i < 10; i++){
            synchronized (sharedConter){
                sharedConter.increment();
                sharedConter.notify();

                try {
                    sharedConter.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        synchronized (sharedConter){
            sharedConter.notify();
        }

    }
}
