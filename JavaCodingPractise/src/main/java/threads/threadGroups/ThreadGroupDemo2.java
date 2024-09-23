package threads.threadGroups;

class MyThread extends Thread{
    MyThread(ThreadGroup g, String name){
        super(g, name);
    }
    public void run(){
        System.out.println("Child thread..");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.getMessage();
        }
    }
}


public class ThreadGroupDemo2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup pg = new ThreadGroup("parent group");
        ThreadGroup cg = new ThreadGroup(pg, "child group");

        //create few thread inside this parent group to hv fun
        MyThread t1 = new MyThread(pg, "Child Thread1");
        MyThread t2 = new MyThread(pg, "Child Thread2");
        t1.start();
        t2.start();
        //now how to see group info
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();

        Thread.sleep(10000);
        //now how to see group info
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();


    }

}
