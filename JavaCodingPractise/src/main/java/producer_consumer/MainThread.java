package producer_consumer;

public class MainThread {

    public static void main(String[] args) {
        int[] buffer = new int[1]; // Single slot buffer
        Object lock = new Object();

        // Create producer and consumer with the shared buffer and lock
        Producer producer = new Producer(buffer, lock);
        Consumer consumer = new Consumer(buffer, lock);

        // Create threads for producer and consumer
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
