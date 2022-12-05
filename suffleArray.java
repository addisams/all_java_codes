// class Solution {
//     public int[] shuffle(int[] nums, int n) {

//         int[] result = new int[nums.length];
//         int leftPartStartIndex = 0;
//         int rightPartStartIndex = n;

//         for (int i = 0; i < result.length; i += 2) {
//             result[i] = nums[leftPartStartIndex];
//             leftPartStartIndex++;
//         }
        
//         for (int i = 1; i <= result.length; i += 2) {
//             result[i] = nums[rightPartStartIndex];
//             rightPartStartIndex++;
//         }
        
//         return result;
//     }
// }




// // class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int res[]=new int[nums.length];
//         int j=0;
// public class suffleArray {
    
// }
//         for(int i=0;i<n;i++) {
//             res[j++]=nums[i]; 
//             res[j++]=nums[i+n];
//         }
//         return res;
//     }
// }
