package threads.GreetingCrickers;

public class TestGreeting {

    public static void main(String[] args) {

        Greeting g = new Greeting();

        MyThread t1 = new MyThread("Dhoni", g);
        MyThread t2 = new MyThread("Kohli", g);

        t1.start();
        t2.start();
    }

}
