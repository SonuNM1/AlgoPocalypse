package Numbers;

/*
A prime number is greater than 1 and has only two divisors: 1 and itself 
 */

import java.util.Scanner ; 

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("\n Enter a number to check if it is prime: ");

        int num = sc.nextInt() ;
        sc.close(); 

        if(isPrime(num)){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime");
        }
    }

    public static boolean isPrime(int num){

        // edge case: handle numbers less than 2 

        if(num < 2){
            return false ; 
        }

        // check divisors from 2 to root(num)

        for(int i=2 ; i < Math.sqrt(num) ; i++){
            if (num % i == 0){
                return false ; // divisible by a number other than 1 and itself
            }
        }

        return true ; 

    }
}
