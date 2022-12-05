package object_oriented_programing.inheritense;

public class Main {
    public static void main(String[] args) {
        //only parent
        BaseBox b1=new BaseBox();
        System.out.println(b1.len+" "+b1.brd+" "+b1.hght);

        BaseBox b2=new BaseBox(10.2,11.45,15.67);
        System.out.println(b2.len+" "+b2.brd+" "+b2.hght);

        BaseBox b3=new BaseBox(45.67);
        System.out.println(b3.len+" "+b3.brd+" "+b3.hght);

        BaseBox b4=new BaseBox(b2);
        System.out.println(b4.len+" "+b4.brd+" "+b4.hght);
       
        //parent child
        //you can initialize
        BaseBox b5=new DerivedBoxWeight(10.5,4.5,6.2,3.4);
        //but you can access only those which is in refrence type i.e in BaseBox.
        //you can not acccess property of DerivedBoxWeight.
        //means whch variable will be accessed will be depend on refrence type
        //System.out.println(b5.len+" "+b5.brd+" "+b5.hght+" "+b5.weight);//error in weight

        System.out.println(b5.len+" "+b5.brd+" "+b5.hght);//this can be done

        DerivedBoxWeight b6=new DerivedBoxWeight(13.5,45.56,65.33,33.34);

        System.out.println(b6.len+" "+b6.brd+" "+b6.hght+" "+b6.weight);

        //DerivedBoxWeight b7=new BaseBox(3.4,4.5,66.7);  //always error because parent does not know about child

        //multilevel and heriarical inheritense

        DerivedBoxWeight d1=new Multilevel();
        //System.out.println(d1.len+""+d1.brd+""+d1.hght+""+d1.weight+""+d1.perimeter);//unable to access perimeter
   
        System.out.println(d1.len+""+d1.brd+""+d1.hght+""+d1.weight);

        // Multilevel m1=new Multilevel();
        // System.out.println(m1.len+" "+m1.brd+" "+m1.hght+" "+m1.weight+" "+m1.perimeter);

        // Multilevel m1=new Multilevel(12.5);
        // System.out.println(m1.len+" "+m1.brd+" "+m1.hght+" "+m1.weight+" "+m1.perimeter);

        Multilevel m1=new Multilevel(25.4,23.45,34.54,24.54,21);
        System.out.println(m1.len+" "+m1.brd+" "+m1.hght+" "+m1.weight+" "+m1.perimeter);

        Multilevel m2=new Multilevel(m1);
        System.out.println(m2.len+" "+m2.brd+" "+m2.hght+" "+m2.weight+" "+m2.perimeter);


    }
    
}
