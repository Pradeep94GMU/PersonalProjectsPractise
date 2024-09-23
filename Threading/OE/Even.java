class Even implements Runnable {

    private final Shared shared;

    public Even(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
       try{
        shared.printEven(); 
        
       }catch(InterruptedException e){
        e.printStackTrace();
       }
                
           
        }

}