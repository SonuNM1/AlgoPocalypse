
/*
Optimized approach : O(n)

Find a contiguous subarray in the given array such that its sum equals the targetSum. If such a subarray exists, print its indices and the elements. If no subarray is found, print an appropriate message.
*/

package SubArray;

public class SubarraySum4 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,7,5} ;
        int targetSum = 12 ;

        int currentSum = 0 ; 
        int i = 0 ; 
        boolean found = false ; 

        for(int j=0 ; j < arr.length ; j++){

            currentSum += arr[i] ; 

            while(currentSum > targetSum && i <= j){
                currentSum -= arr[i] ; 
                i++ ; 
            }

            if(targetSum == currentSum){
                System.out.println("start: " + i + " end: " + j);

                // printing the subarray 
                
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
                found = true ; 

            }

        }

        if(!found){
            System.out.println(" subarray not found");
        }

    }
}
