public class CountEvenOdd {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,7,6} ; 

        int evenCount = 0, oddCount = 0 ; 

        for(int i=0 ; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++ ; 
            }
            else{
                oddCount++ ; 
            }
        }    
        
        System.out.println("\nEven count: " + evenCount + " Odd count: " + oddCount);

    }   
}
