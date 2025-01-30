package Numbers;

public class PowerOfTwo {
    public static void main(String[] args) {
        
        int num = 8 ; 

        if(isPowerOfTwo(num)){
            System.out.println("\n" + num + " is a power of 2");
        }
        else{
            System.out.println("\n" + num + " is not a power of 2"); 
        }
    }

    public static boolean isPowerOfTwo(int num){
        if(num <= 0){
            return false; // power of 2 are +ve integers 
        }

        while(num != 1){
            if(num % 2 != 0){
                return false ; 
            }
            else{
                num = num / 2 ; 
            }
        }
        return true ; 
    }
}
