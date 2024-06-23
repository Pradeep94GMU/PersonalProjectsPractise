package producer_consumer;

public class Producer implements Runnable {

    private final int[] buffer;
    private final Object lock;

    public Producer(int[] buffer, Object lock) {
        this.buffer = buffer;
        this.lock = lock;
    }

    @Override
    public void run() {
        int item = 1; // Start producing from item 1
        while (true) {
            synchronized (lock) {
                try {
                    // Wait if the buffer is not empty
                    while (buffer[0] != 0) {
                        lock.wait();
                    }

                    // Produce an item and put it into the buffer
                    buffer[0] = item;
                    System.out.println("Produced: " + item);
                    item++; // Produce the next item

                    // Notify the consumer that the buffer is not empty
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
