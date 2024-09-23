class MainThread{

    public static void main(String[] args){
        SharedBalance balance = new SharedBalance(1200);

        Deposit deposit1 = new Deposit(balance, 2200,5);
        Withdrawl withdraw1 = new Withdrawl(balance, 1600,5);

        Thread thread1 = new Thread(deposit1, "DepositThread1");
        Thread thread2 = new Thread(withdraw1, "WithdrawThread1");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
        thread2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Total left amount: " + balance.getBalance());

    }
}