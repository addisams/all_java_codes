package search;
import java.util.Arrays;

public class LinearSearchIn2D {
    public static void main(String[] args) {
        int[][] arr={ {2,5,7},
                       {3,6,4},
                       {5,10,11}
                    };
        int[] ans= linearSearch2DArrays(arr,11);
        System.out.println(Arrays.toString(ans));        
        
    }
    static int[] linearSearch2DArrays(int[][] arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[] { row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    
}
