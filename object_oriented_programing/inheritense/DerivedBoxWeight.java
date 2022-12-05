package object_oriented_programing.inheritense;

public class DerivedBoxWeight extends BaseBox {
    double weight;
    public DerivedBoxWeight()
    {
        this.weight=-1;
    }

    public DerivedBoxWeight(Double side)
    {
      super(side);
      this.weight=side;

    }
    public DerivedBoxWeight(double len,double brd,double hght,double weight)
    {
        super(len, brd, hght);
        this.weight=weight;
    }
    public DerivedBoxWeight(DerivedBoxWeight other)
    {
        super(other);
        this.weight=other.weight;
    }
}
