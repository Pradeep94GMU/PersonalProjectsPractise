class MainThread{

    public static void main(String[] args){

        ProducerConsumer prodCons = new ProducerConsumer();

        Producer producer = new Producer(prodCons);
        Consumer consumer = new Consumer(prodCons);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }
}