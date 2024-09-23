package threads.EVENODD;

public class Main {

    public static void main(String[] args) {

        Object lock = new Object();

        EvenThread evenThread = new EvenThread(lock);
        OddPrint oddPrint = new OddPrint(lock);

        oddPrint.start();
        evenThread.start();
    }

}
