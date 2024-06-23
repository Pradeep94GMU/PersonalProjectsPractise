package producer_consumer;

public class Buffer {
    private int item = 0; // 0 indicates the buffer is empty

    public synchronized void produceItem(int newItem) throws InterruptedException {
        while (item != 0) {
            wait();
        }
        item = newItem;
        System.out.println("Produced: " + newItem);
        notify();
    }

    public synchronized void consumeItem() throws InterruptedException {
        while (item == 0) {
            wait();
        }
        System.out.println("Consumed: " + item);
        item = 0;
        notify();
    }
}
