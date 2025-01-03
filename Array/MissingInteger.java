public class MissingInteger {
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,5} ; 

        FindMissingElement(arr) ; 

    }
    public static void FindMissingElement(int[] arr){

        int totalSum = 0 ; 
        int n = arr.length+1 ;  // since length will also include the missing element  

        for(int element: arr){
            totalSum += element ; 
        }

        int continuousSum = (n*(n+1))/2 ; 

        int missingElement = continuousSum - totalSum ; 

        System.out.println("\n missing element: " + missingElement);
    }
}
