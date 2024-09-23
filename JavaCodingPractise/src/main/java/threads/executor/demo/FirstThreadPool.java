package threads.executor.demo;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{

    String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run() {
        System.out.println(" task started by: "+ Thread.currentThread().getName()+" running by: "+ name);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.getMessage();
        }
        System.out.println(" task completed by : "+ Thread.currentThread().getName());

    }
}


public class FirstThreadPool {
    public static void main(String[] args) {

        MyThread[] jobs = {
                new MyThread("Rahul"),
                new MyThread("Pradeep"),
                new MyThread("Sumit"),
                new MyThread("Nilu"),
                new MyThread("Kuldeep"),
                new MyThread("Aagy"),
        };

        //now as we are using thread pool, we need to creaate executor service
        ExecutorService service = Executors.newFixedThreadPool(3);
        //assign the jobs to this service

        for( MyThread job: jobs){
            service.submit(job);
        }

        //as thread pool will complete the job, we can shutdown the service
        service.shutdown();

    }


}
