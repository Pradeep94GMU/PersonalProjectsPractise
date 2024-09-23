package adapterDesignPatter;

public class AdapterSq extends RoundPeg{

    //has A relationship
    SquarePeg squarePeg;
    public AdapterSq(SquarePeg squarePeg){
        super((int) ((int)squarePeg.getSide() * Math.sqrt(2) / 2));
        this.squarePeg = squarePeg;
    }





}
