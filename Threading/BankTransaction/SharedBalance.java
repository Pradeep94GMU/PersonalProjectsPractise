class SharedBalance{
    private int balance;
    boolean done = false;

    public SharedBalance(int balance){
        this.balance = balance;
    }

    public synchronized void depositBalance(int amount) throws InterruptedException
    {
        if(done == false){
            wait();
        }
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited balance " + amount + 
        " total balance "+ balance);

        done = false;
        notifyAll();
        


    }

    public synchronized void withdrawlBalance(int amount) throws InterruptedException{
        if(done == true){
            wait();
        }
        if(amount <= balance){
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdraw balance " + amount + 
            " total balance "+ balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " Not sufficient balance" + " Total Balance " + balance);
        }
        done = true;
        notifyAll();

    
    }


    public synchronized int getBalance(){
        return balance;
    }
}