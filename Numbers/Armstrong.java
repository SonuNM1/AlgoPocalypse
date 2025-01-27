package Numbers;

/*
Armstrong number (aka narcissistic number) is a number that is equal to the sum of its own digits, each raised to the power of the number of its digits. 

    Example : 

        153 = 1^3 + 5^3 + 3^3 (3 digits, each raise to 3rd power)

*/

public class Armstrong {
    public static void main(String[] args) {
        
        int num = 153 ; 
        int originalNum = num ; 
        int power = 0 ; 

        int temp = num ; 
        while(temp != 0){
            temp = temp / 10 ;    // 
            power++ ; 
        }

        int result = 0 ; 

        while(originalNum != 0){
            int digit = originalNum % 10 ; // 3
            result += Math.pow(digit, power); 
            originalNum = originalNum / 10 ; 
        }

        if (result == num) {
            System.out.println("\n armstrong");
        }
        else{
            System.out.println("\n not armstrong");
        }
    }
}
