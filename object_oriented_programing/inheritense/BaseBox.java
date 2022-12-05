package object_oriented_programing.inheritense;

public class BaseBox {
    double len;
    double brd;
    double hght;

    public BaseBox()
    {
        this.len=-1;
        this.brd=-1;
        this.hght=-1;
    }
    public BaseBox(double side)
    {
        this.len=side;
        this.brd=side;
        this.hght=side;
    }
    public BaseBox(double l,double b,double h)
    {
        this.len=l;
        this.brd=b;
        this.hght=h;
    }
    public BaseBox(BaseBox other)
    {
        this.len=other.len;
        this.brd=other.brd;
        this.hght=other.hght;
    }

}
