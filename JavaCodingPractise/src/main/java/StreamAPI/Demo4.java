package StreamAPI;

public class Demo4 {
    public static void main(String[] args) {

        callPrint(0);
    }


    static void callPrint(int n){


        if(n > 10){
            return;
        }

        //System.out.println(n);
        callPrint(n + 1);
        System.out.println(n); //while returning, it will print

    }
}
