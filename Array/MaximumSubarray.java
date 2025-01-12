
/*
max subarray or kadane's algo, is about finding contiguous subarray within a given array, which has the largest sum
 */

public class MaximumSubarray {
    public static void main(String[] args) {
        
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4} ; 

        // start by assuming the first element of the array as both the current sum and the maximum sum. 

        int currentSum = nums[0] ; 
        int maxSum = nums[0] ;

        for(int i=1 ; i < nums.length ; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]) ;
            
            maxSum = Math.max(maxSum, currentSum) ; 
        }

        System.out.println("\n max subarray sum : " + maxSum) ; 

    }
}
