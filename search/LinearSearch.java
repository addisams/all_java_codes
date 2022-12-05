package search;
public class LinearSearch {
    public static void main(String[] args)
    {
        // int[] arr={3,42,32,2,56,8,92,3};
        // int ans=linearSearchInteger(arr,93);

        // String str="Adarsh Srivastav";
        // int ans=linearSearchString(str,'i');

         int[] arr={3,42,32,2,56,8,92,3};
        int ans=linearSearchInRange(arr,92,1,7);
        System.out.println("found at index no:" + ans);

        

    }
    static int linearSearchInteger(int[] arr,int target)
    {
      if(arr.length==0)
      {
        return -1;
      }
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==target)
        {
            return i;
        }
      }
      return -1;
    }

    static int linearSearchString(String str, char target)
    {
        if(str.length()==0)
        {
            return -1;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                return i;
            }
        }
        return -1;
    }

    static int linearSearchInRange(int[] arr, int target, int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        if(start>end)
        {
            return -1;
        }
    
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }

        }
        return -1;
    }
}
