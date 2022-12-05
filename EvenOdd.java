import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0)
        {
            System.out.println("this is even number");
        }
        else{
            System.out.println("this is odd number");
        }
    }
    
}
