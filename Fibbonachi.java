import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        // fibbo(n);

        // method 1
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int sum;
        for(int i=2;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
        
    }
    // static void fibbo(int n)
    // {
    //     int a=0;
    //     int b=1;
    //     System.out.println(a);
    //     int sum;
    //     for(int i=2;i<=n;i++)
    //     {
    //         sum=a+b;
    //         a=b;
    //         b=sum;
    //         System.out.println(sum);
    //     }
        

    // }
}
