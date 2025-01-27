package Numbers;

/*
A perfect number is a positive integer that is equal to the sum of its proper divisors (divisors excluding the number itself). 

For example, 6 is a perfect number because the sum of its divisors (excluding 6) is:
 */

public class PerfectNumber {
    public static void main(String[] args) {
        
        int num = 6 ; 

        if(isPerfectNumber(num)){
            System.out.println("\n" + num + " is a perfect number");
        }
        else{
            System.out.println("\n" + num + " is not a perfect number");
        }

    }

    public static boolean isPerfectNumber(int num){

        if(num <= 1){
            return false; // numbers less than or equal to  are not perfect number 
        }

        int divisorSum = 0 ;
        
        for(int i=1 ; i <= num/2 ; i++){
            if(num % i == 0){
                divisorSum += i ; 
            } 
        }

        // check if sum of divisors equals the number 

        return divisorSum == num ; 

    }
}
