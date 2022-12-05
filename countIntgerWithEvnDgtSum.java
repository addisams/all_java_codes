public class countIntgerWithEvnDgtSum {
    public static void main(String[] args) {
        int num=30;
        System.out.println(countEven(num));
        
    }
    static int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(i<10 && (i%2==0))
            {
                count++;
            }
            else if(i>10)
            {
            if(countDigtSum(i))
            {
                count++;
            }

            }
            
        }
        return count;
    }
    static boolean countDigtSum(int i) {
        int sum=0,rem;
        while(i>0)
        {
            rem=i%10;
            sum=sum+rem;
            i=i/10;
        }
        
        return sum%2==0;
    }
}
