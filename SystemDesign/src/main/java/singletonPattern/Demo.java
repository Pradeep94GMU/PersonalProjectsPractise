package singletonPattern;

public class Demo {

    private static Demo d; //ref to null

    private Demo(){

    }

    public static Demo getD(){

        if(d == null){
            d = new Demo();
        }

        return d;
    }



}
