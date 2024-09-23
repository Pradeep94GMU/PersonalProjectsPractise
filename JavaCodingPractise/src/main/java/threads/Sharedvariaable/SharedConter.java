package threads.Sharedvariaable;

public class SharedConter {

    int counter = 0;

    synchronized public void increment(){
        counter++;
        System.out.println("updated by Thread: "+Thread.currentThread().getName()+" Value: "+counter);
    }

}
