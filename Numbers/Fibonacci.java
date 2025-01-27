
package Numbers;

import java.util.Scanner;

/*
Generate the Fibonacci sequence up to a given number of terms.

The Fibonacci sequence starts with 0, 1, and each subsequent number is the sum of the previous two.
*/

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n Enter the number of terms: ");

        int n = sc.nextInt() ; 

        int a = 0 , b = 1 ; // first two fibonacci numbers 

        System.out.println("\n Fibonacci sequence: ");

        for(int i=0 ; i < n; i++){
            System.out.print(a + " ");
            int next = a + b ; 
            a = b ; 
            b = next ; 
        }

        sc.close();
    }
}
