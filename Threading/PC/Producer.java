class Producer implements Runnable{

    private final ProducerConsumer prodCon;

    public Producer(ProducerConsumer prodCon){
        this.prodCon = prodCon;
    }

    @Override
    public void run(){
        int item = 1;
        while(true){
            try{
                prodCon.produceItem(item);
                item++;
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}