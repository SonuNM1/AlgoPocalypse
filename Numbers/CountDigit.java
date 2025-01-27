package Numbers;

public class CountDigit {
    public static void main(String[] args) {
        
        int num = 123; 
        int count = 0 ; 

        while(num != 0){
            int digit = num % 10 ; 
            num = num / 10 ; 
            count ++ ; 
        }

        System.out.println("\n count: " + count);

    }   
}
