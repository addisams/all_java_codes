package object_oriented_programing.other_package;
//for not static methods imoport
import object_oriented_programing.package_and_static.Message;

//for static methods imports
// import static object_oriented_programing.package_and_static.Message.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("i am in main");
        //for static methods
        // greet();
        // message();
        // intro();

        //for non static methods
        Message msg=new Message();
        msg.greet();
        msg.message();
        msg.intro();

    }
}
