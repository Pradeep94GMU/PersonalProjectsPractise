package adapterDesignPatter;

public class RoundHole {

    int radius;
    RoundHole(int radius){
        this.radius = radius;
    }

    public boolean fit(RoundPeg peg){
        return this.radius >= peg.getRadius();
    }

}
