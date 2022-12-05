package object_oriented_programing;

public class Student {
    //instace variables
    int rollNo;
    String name;
    float marks;
    //creating constructor
    //default constructor
    public Student()
    {
        this.rollNo=1;
        this.name="Abhay kumar";
        this.marks=34.56f;
    }

    // calling one constructor from another constructor

    // public Student()
    // {
    //     this(5, "sammrat", 35.55f);
    // }

    //parametrized constructor
public Student(int rollNo,String name,float marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    // copy constructor
    public Student(Student otherStudent)
    {
        this.rollNo=otherStudent.rollNo;
        this.name=otherStudent.name;
        this.marks=otherStudent.marks;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("objec is destroid");
    }

    
}
