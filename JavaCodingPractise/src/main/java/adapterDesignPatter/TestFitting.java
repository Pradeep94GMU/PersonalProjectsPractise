package adapterDesignPatter;

public class TestFitting {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);


        RoundPeg roundPeg = new RoundPeg(6);

        //this will fit the round hole as both have radius
        System.out.println(roundHole.fit(roundPeg));

        //now i need to fit the square peg into round hole, can't do that directly
        //need to create some formula to adjust first and dont need to modify the existing code as well

        SquarePeg squarePeg = new SquarePeg(17);

        //need to create a adaptor whcih takes squarepeg and then this
        //as i hv adapter, i can use the adapter to make vaalidation
        AdapterSq adapterSq = new AdapterSq(squarePeg);
        System.out.println(roundHole.fit(adapterSq)); //this will not work..






    }



}
