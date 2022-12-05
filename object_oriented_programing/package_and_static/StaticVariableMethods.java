package object_oriented_programing.package_and_static;

public class StaticVariableMethods {
    int age;
    String name;
    static long population;

    public StaticVariableMethods()
    {
      this.age=18;
      this.name="adarsh srivastav";
      StaticVariableMethods.population+=1;
    }
    public StaticVariableMethods(int age,String name)
    {
      this.age=age;
      this.name=name;
      StaticVariableMethods.population+=1;
    }


    //static block study

    static int a=5;
    static int b;
    //static block run only once
    static{
        System.out.println("i am in static block");
        b=a*4;
    }
   public static void main(String[] args) {
    //can access static directly
    // System.out.println(b);
    //always access static using class name
    System.out.println(StaticVariableMethods.b);
    // b+=3;
    StaticVariableMethods.b+=3;
    // System.out.println(a+" "+b);
    System.out.println(StaticVariableMethods.a+" "+StaticVariableMethods.b);
   }
    
}
