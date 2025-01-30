package Bit_Manipulation;

import java.util.Scanner ; 

public class PowerOfTwo2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n Enter a number to check whether power of 2: ");

        int num = sc.nextInt() ; 

        System.out.println("\n" + isPowerOfTwo(num)); ; 

    }
    public static boolean isPowerOfTwo(int num){

        int value = (num) & (num-1) ; 

        if(value == 0){
            return true ; 
        }

        return false ; 
    }
}
