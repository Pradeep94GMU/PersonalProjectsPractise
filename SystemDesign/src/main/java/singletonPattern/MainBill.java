package singletonPattern;

public class MainBill {
    public static void main(String[] args) {

        BillPugh instance = BillPugh.getInstance();
        System.out.println(instance.hashCode());
    }
}
