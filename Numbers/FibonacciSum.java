package Numbers;

import java.util.Scanner ; 

public class FibonacciSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n Enter the number of fibonacci terms: ");
        int n = sc.nextInt() ; 

        if (n <= 0){
            return ; 
        }

        int a = 0 , b = 1 ;  
        int sum = a ; // initialize the sum with the first number 

        for(int i=0 ; i < n ; i++){
            System.out.print(a + " ");
            sum += a ; 
            int next = a + b ; 
            a = b ; 
            b = next ;  
        }

        System.out.println("\n Sum: " + sum);

    }
}
