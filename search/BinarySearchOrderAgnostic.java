package search;
public class BinarySearchOrderAgnostic {
    public static void main(String[] args)
    {
        int[] arr={56,34,23,12,4,3};
        int ans=orderAgnosticBinarySearch(arr,23);
        System.out.println(ans);

    }
    static int orderAgnosticBinarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if(arr.length==0)
        {
            return -1;
        }

        boolean isAsc;
        if(arr[start]<arr[end])
        {
            isAsc=true;
        }
        else
        {
            isAsc=false;
        }
        while(start<=end)
        {
            int mid=start + (end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }
                
            }
            else
            {
                if(arr[mid]>target)
                {
                    
                    start=mid+1;
                }
                else if(arr[mid]<target)
                {
    
                    end=mid-1;
                }
            }
        }
        return -1;

    }
    
}
