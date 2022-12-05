public class MaxMin {
    public static void main(String[] args)
    {
        int[] arr={-54,-24,-90,-1,-280,1,5,7};
        // int ans=maxInteger(arr);
        int ans=minInteger(arr);
        System.out.println(ans);

    }
    static int maxInteger(int[] arr)
    {
        int maxVal=Integer.MIN_VALUE;
        if(arr.length==0)
        {
            maxVal=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }
        return maxVal;

    }

    static int minInteger(int[] arr)
    {
        int minVal=Integer.MAX_VALUE;
        if(arr.length==0)
        {
            minVal=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<minVal)
            {
                minVal=arr[i];
            }
        }
        return minVal;
    }
}
