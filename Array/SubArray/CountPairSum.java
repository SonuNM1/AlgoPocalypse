package SubArray;

/*
Given an array of integers and a target sum, the task is to count the number of distinct pairs (i, j) such that the sum of the elements at indices i and j equals the target sum. A pair (i, j) is valid only if i < j.

Example:
Input: array = [1, 5, 7, -1, 5], targetSum = 6
Output: 3

Explanation:
Pairs with the sum 6: (1, 5), (7, -1), (1, 5) (the last 5).
Total count = 3.
 */

public class CountPairSum {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,7,5} ;
        int targetSum = 12 ; 

        int countPair = 0, currentSum = 0, i = 0; 

        for(int j=0 ; j < arr.length ; j++){
             currentSum += arr[j] ; 

             while(currentSum > targetSum && i <= j ){
                currentSum -= arr[i] ; 
                i++ ; 
             }

             if(targetSum == currentSum){
                countPair++ ; 
             }
        }

        System.out.println("\n Count pair sum: " + countPair);

    }
}
