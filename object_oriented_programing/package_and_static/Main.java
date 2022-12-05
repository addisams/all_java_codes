package object_oriented_programing.package_and_static;

public class Main {
    public static void main(String[] args) {
        System.out.println("i am in main");
        // Main mn=new Main();
        // mn.greet();
        System.out.println(StaticVariableMethods.population);


        StaticVariableMethods stdnt=new StaticVariableMethods();
        System.out.println(StaticVariableMethods.population); 

        StaticVariableMethods hmn_1=new StaticVariableMethods(22,"sandy");
        StaticVariableMethods hmn_2=new StaticVariableMethods(22,"sagar");

        System.out.println(hmn_2.name+" "+StaticVariableMethods.population); 
    }
    // public void greet()
    // {
    //     System.out.println("how are your");
    // }

    

}
