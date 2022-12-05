import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args)
    {

        int[] arr={3,4,2,1,9};
        reverseArrayInteger(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverseArrayInteger(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;

        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
