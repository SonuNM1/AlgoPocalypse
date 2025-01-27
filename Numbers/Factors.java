package Numbers;

public class Factors {
    public static void main(String[] args) {
        
        int num = 12 ; 

        if (num == 0){
            return ; 
        }

        if (num < 0){
            num = Math.abs(num) ; // consider absolute value for negative  
        }

        int count = 0 ; 

        for(int i=1 ; i < 12 ; i++){
            if(num % i == 0){
                count ++ ; 
                System.out.println("\n Factors: " + i);
            }
        }

        System.out.println("\n total factors: " + count);

    }
}
