public class Floor {
    //gratest number which is smaller or equal to the target element.
    public static void main(String[] args) 
    {
        int[] arr={23,34,54,65,78,98,109};
        int ans=floorInteger(arr,35);
        System.out.println(ans);
        
    }
    static int floorInteger(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if(arr.length==0)
        {
            return -1;
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    
}
