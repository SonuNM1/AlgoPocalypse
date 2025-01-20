
public class MissingNumber {
    public static void main(String[] args) {
    
        int[] num1 = {1, 2, 4, 5, 6} ;

        int totalSum = 0 ; 
        int n = num1.length + 1 ;   // since one element missing, so the length would be +1  
        int expectedSum = (n*(n+1))/2 ; 

        for(int element : num1){
            totalSum += element ; 
        }

        int missingNumber = expectedSum - totalSum ; 

        System.out.println("\n missing number: " + missingNumber);

    }
}
