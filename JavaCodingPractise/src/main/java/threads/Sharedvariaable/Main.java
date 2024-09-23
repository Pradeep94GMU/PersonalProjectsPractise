package threads.Sharedvariaable;

public class Main {

    public static void main(String[] args) {

        SharedConter sharedConter = new SharedConter();

        ThreadCommon threadCommon1 = new ThreadCommon(sharedConter);
        ThreadCommon threadCommon2 = new ThreadCommon(sharedConter);

        threadCommon1.start();
        threadCommon1.start();
        threadCommon2.start();
    }

}
