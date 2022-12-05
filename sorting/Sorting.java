package sorting;
import java.util.Arrays;

public class Sorting {
        public static void main(String[] args) {
            int[] arr={3,1,5,4,2};
            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
            
        }
        static void bubbleSortAlgo(int[] arr)
        {
            boolean swapped;
            //run first loop from 0 to length-1
            for(int i=0;i<arr.length;i++)
            {
                swapped=false;
                //run internal loop from length-i;
                for(int j=1;j<arr.length-i;j++)
                {
                    if(arr[j]<arr[j-1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }
                if(!swapped)
                {
                    break;
                }
            }
    
        }

        static void selectionSort(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                int lastIndex=arr.length-i-1;
                int maxIndex= max(arr,0,lastIndex);
                swap(arr,maxIndex,lastIndex);
            }
        }
         
        static int max(int[] arr, int start, int lastIndex) {

            int maxVal=start;
            for(int i=0;i<=lastIndex;i++)
            {
                if(arr[maxVal]<arr[i])
                {
                    maxVal=i;
                }
            }
            return maxVal;
        }
        static void swap(int[] arr, int first, int second) {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;

        }
    
}
