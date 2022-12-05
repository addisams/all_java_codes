//given an array find how many element contains even no of digits
public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
        
    }
    static int findNumber(int[] numb)
    {
        int count=0;
        for(int num:numb)
        {
            if(evenDgt(num))
            {
                count++;
            }
        }


        return count;
    }
     static boolean evenDgt(int num) {
        int numberOfDigits=digits(num);
    
        return numberOfDigits%2==0;
    }
    static int digits(int num) {
        int count=0;
        if(num<0)
        {
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }

        while(num>0)
        {
            count++;
            num=num/10;
        }
        
        return count;
    }
 
}
