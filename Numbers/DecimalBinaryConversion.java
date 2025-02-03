package Numbers;

import java.util.Scanner;

public class DecimalBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n Enter the no to convert in binary: ");
        int num = sc.nextInt() ; 

        System.out.println("\n Binary conversion: " +   decimalToBinary(num));
    }   
    
    public static String decimalToBinary(int num){

        if(num == 0) return "0" ; // edge case for 0 

        String binary = "" ; 

        while(num > 0){
            int remainder = num % 2 ; 
            binary = remainder + binary ; 
            num = num / 2 ; 
        }

        return binary ; 

    }
}
