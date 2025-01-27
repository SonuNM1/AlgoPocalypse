package Numbers;

/*
A proper divisor of a number is any divisor of that number except the number itself. In other words, it’s any number that divides the original number evenly (without a remainder) but is not equal to the original number.

For example:

Proper divisors of 6: 1, 2, 3 (Note: 6 is excluded)
Proper divisors of 12: 1, 2, 3, 4, 6 (Note: 12 is excluded)
 */

public class ProperDivisor {
    public static void main(String[] args) {
        int num = 28 ; 

        System.out.println("\n Proper divisors of " + num + " are:");
        printProperDivisor(num) ; 
    }

    public static void printProperDivisor(int num){

        if(num <= 1){
            System.out.println("no divisor");
            return ;
        }

        for(int i=1 ; i <= num/2 ; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
