class ProducerConsumer{
	private int item = 0; //consumeer needs to wait

	public synchronized void produceItem(int newItem) throws InterruptedException
    {
        //how to do inter process communication
        while(item != 0){
            wait();
        }
		item = newItem;
		System.out.println("Produced Item: "+newItem);
        notify();
	}

	public synchronized void consumerItem() throws InterruptedException
    {
        while(item == 0){
            wait();
        }
		System.out.println("Consumed Item: "+item);
		item = 0;
        notify();

	}


}