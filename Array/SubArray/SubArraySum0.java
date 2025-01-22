package SubArray;

public class SubArraySum0 {
    public static void main(String[] args) {
            
        int[] arr = {1, 2, -1, 0} ; 

        for(int i=0 ; i < arr.length ; i++){
            int currentSum = 0 ;  

            for(int j = i ; j < arr.length ; j++){
                currentSum += arr[i] ;
                
                if(currentSum == 0){
                    System.out.println("\n subarray with sum 0 found from index: " + i + " and " + j);
                }
            }
        }
    }
}
