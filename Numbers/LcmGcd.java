package Numbers;
import java.util.Scanner ; 

public class LcmGcd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n Enter two numbers: ");

        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ; 

        int originalN1 = n1 ;
        int originalN2 = n2 ; 

        while(n1 % n2 != 0){
            int remainder = n1 % n2 ; 
            n1 = n2 ;
            n2 = remainder ;
        }

        System.out.println("\n GCD: " + n2);

        int lcm = (originalN1 * originalN2) / n2 ; 

        System.out.println("\nLCM: " + lcm);
        sc.close();

    }
}
