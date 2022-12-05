package object_oriented_programing;

public class Main {
    public static void main(String[] args)
    {
        //calling default constructor
        Student firStudent=new Student();
        System.out.println(firStudent.rollNo+" "+firStudent.name+" "+firStudent.marks);

        //calling parameterized constructor

        Student dileep=new Student(34,"dileep kumar",88.25f);
        System.out.println(dileep.rollNo+" "+dileep.name+" "+dileep.marks);

        // calling copy constructor
        Student adarshStudent=new Student(dileep);
        System.out.println(adarshStudent.name);

        // Student obj;
        // for(int i=0;i<500;i++)
        // {
        //     obj=new Student(dileep);
        //     System.out.println(dileep.name);
        // }
    }
}
