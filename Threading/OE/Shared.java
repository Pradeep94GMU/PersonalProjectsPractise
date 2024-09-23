class Shared {
    private int currentNumber = 1;
    private int MAX = 10;

    public synchronized void printEven() throws InterruptedException
    {
        while(currentNumber <= MAX ){
            if (currentNumber % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(currentNumber <= MAX){
                System.out.println("Even: " + currentNumber);
                currentNumber++;
                Thread.sleep(3000);
                notify();
            }
        }
    }

    public synchronized void printOdd() throws InterruptedException{
        while(currentNumber <= MAX){
            if (currentNumber % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(currentNumber <= MAX){
                System.out.println("Odd: " + currentNumber);
                currentNumber++;
                Thread.sleep(2000);
                notify();
            }
        }
    }
}