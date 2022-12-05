import javax.lang.model.util.ElementScanner14;

public class Ceiling {
    //smallest number which is greater or equal to the target number is know as ceiling
    public static void main(String[] args) 
    {
        int[] arr={5,7,9,20,29,89,92};
        int ans=ceilingInteger(arr,35);
        System.out.println(ans);
    }
    static int ceilingInteger(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+ (end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;

            }
        }
        return start;
    }
    
}
