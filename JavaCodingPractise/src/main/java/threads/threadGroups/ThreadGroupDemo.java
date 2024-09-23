package threads.threadGroups;

public class ThreadGroupDemo {
    public static void main(String[] args) {

        System.out.println("Which grp: "+ Thread.currentThread().getThreadGroup().getName());
        System.out.println("Which parent grp: "+ Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup g = new ThreadGroup( "First Group");
        System.out.println("Which parent grp: "+ g.getName());

        System.out.println("Which parent grp: "+ g.getParent().getName());
        Thread t1 = new Thread();
        System.out.println("Which grp this thread belong: "+ t1.getThreadGroup().getName());


    }

}
