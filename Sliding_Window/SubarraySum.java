
/*
Optimized approach : O(n)

Find a contiguous subarray in the given array such that its sum equals the targetSum. If such a subarray exists, print its indices and the elements. If no subarray is found, print an appropriate message.
*/

package Sliding_Window;

public class SubarraySum {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 2, 7, 5} ; 
        int targetSum = 12 ;
        
        int i = 0; 
        int currentSum = 0 ; 
        boolean found = false ; 

        for(int j = 0 ; j < arr.length ; j++){
            currentSum += arr[j] ;

            while(currentSum > targetSum && i <= j){
                currentSum -= arr[i] ; 
                i++ ; 
            }

            if(currentSum == targetSum){
                System.out.println("\n start: " + i + " end: " + j);
                 
                found = true ; 

                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k] + " ");
                    
                }
                System.out.println();
                break ; 
            }
        }

        if(!found){
            System.out.println("\n subarray not found");
        }

    }
}
