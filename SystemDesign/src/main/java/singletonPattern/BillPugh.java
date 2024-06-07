package singletonPattern;

public class BillPugh {


    private BillPugh(){

    }



    //nested class to instantiate obj
    private static class NestedBill{

        private static final BillPugh obj = new BillPugh();
    }

    public static BillPugh getInstance(){
        return NestedBill.obj;
    }

}
