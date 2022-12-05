package object_oriented_programing.inheritense;

public class Multilevel extends DerivedBoxWeight{
    int perimeter;
    public Multilevel()
    {
        this.perimeter=-1;
    }
    public Multilevel(double side)
    {
        super(side);
        this.perimeter=(int)side;


    }
    public Multilevel(double len,double brd,double hght,double weight,int perimeter)
    {
        super(len, brd, hght, weight);
        this.perimeter=perimeter;
    }
    public Multilevel(Multilevel other)
    {
        super(other);
        this.perimeter=other.perimeter;
    }

}
