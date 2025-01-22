package SubArray;

/*
Subarray with given sum (positive integers) - 

    Naive approach : creating all possible subarray and matching the target sum, loop stops after finding the first subarray with sum equal to the target sum
    
    time complexity - O(n^2)
*/

public class SubarraySum {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 7, 5, 11};  
        int targetSum = 12;
        
        for(int i=0 ; i < arr.length ; i++){

            int currentSum = 0  ;

            for(int j=i ; j < arr.length ; j++){
                currentSum += arr[j] ; 

                if(currentSum == targetSum){
                    System.out.println("\n subarray found between: " + i + " and " + j);
                    return ; 
                }
            }

            System.out.println("\n no subarray found");
        }


    }
}
