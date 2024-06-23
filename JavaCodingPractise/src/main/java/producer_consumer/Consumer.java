package producer_consumer;

public class Consumer implements Runnable {

    private final int[] buffer;
    private final Object lock;

    public Consumer(int[] buffer, Object lock) {
        this.buffer = buffer;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    // Wait if the buffer is empty
                    while (buffer[0] == 0) {
                        lock.wait();
                    }

                    // Consume the item from the buffer
                    System.out.println("Consumed: " + buffer[0]);
                    buffer[0] = 0; // Reset the buffer to empty

                    // Notify the producer that the buffer is empty
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
