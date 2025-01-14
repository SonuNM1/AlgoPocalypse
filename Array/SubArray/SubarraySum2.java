package SubArray;

public class SubarraySum2 {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 2, 5, 7} ; 
        int targetSum = 12 ; 

        boolean found = false ; 

        for(int i=0 ; i < arr.length ; i++){
            int currentSum = 0 ; 

            for(int j=i ; j < arr.length ; j++){
                currentSum += arr[j] ; 

                if(currentSum == targetSum){
                    System.out.println("\n Subarray found between: " + i + " and" + j);
                    found = true ; 
                }
            }
        }

        if(!found){
            System.out.println("\n subarray not found");
        }

    }
}
