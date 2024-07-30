package threads.GreetingCrickers;

public class Greeting {

    public Greeting() {
    }

    public synchronized void greet(String name){
        for(int i = 0; i < 10; i++){
            System.out.print("Good Morning..");

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(name);
        }
    }

}
