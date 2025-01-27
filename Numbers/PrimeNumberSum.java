package Numbers;

public class PrimeNumberSum {
    public static void main(String[] args) {
        int num = 10 ; 

        int sum = 0 ; 

        // loop to find prime number and calculate sum 

        for(int i=2 ; i <= num ; i++){
            if(isPrime(i)){
                sum += i ; 
            }
        }

        System.out.println("\n Sum of prime numbers up to " + num + " is: " + sum);
    }

    public static boolean isPrime(int num){
        if(num < 2){    // 0 and 1 are not prime numbers 
            return false ; 
        }

        for(int i=2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false ; 
            }
        }
        return true ; 
    }
}
