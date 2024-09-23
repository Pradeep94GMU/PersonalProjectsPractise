class Consumer implements Runnable {
    private final ProducerConsumer prodCons;
    public Consumer(ProducerConsumer prodCons){
        this.prodCons = prodCons;
    }

    @Override
    public void run(){
        while(true){
            try{
            prodCons.consumerItem();
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}