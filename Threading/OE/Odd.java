class Odd implements Runnable {

    private Shared shared;

    public Odd(Shared obj) {
        this.shared = obj;
    }

    @Override
    public void run() {
        try{
        shared.printOdd();  
       }catch(InterruptedException e){
        e.printStackTrace();
       }
       
             
             //Thread.sleep(2000);
           
    
    }
}
