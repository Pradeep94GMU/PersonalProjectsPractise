class MainThread{

    public static void main(String[] args){

        Shared shared = new Shared();

        Even even = new Even(shared);
        Odd odd = new Odd(shared);

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t2.start();

    }
}