package threads.GreetingCrickers;

public class MyThread extends Thread{

    String name;
    Greeting g1;

    public MyThread(String name, Greeting g1 ){
        this.name = name;
        this.g1 = g1;
    }
    public void run(){
        g1.greet(name);
    }

}
