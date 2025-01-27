
import java.util.Scanner; 

public class RemoveCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the string: ");
        String inputString = sc.nextLine() ;

        System.out.println("Enter the character you want to remove: ");
        char ch = sc.next().charAt(0) ; 

        System.out.println("Original string: " + inputString);

        StringBuilder result = new StringBuilder() ; 

        for(int i=0 ; i < inputString.length() ; i++){
            if(inputString.charAt(i) != ch){
                result.append(inputString.charAt(i)) ; 
            }
        }

        System.out.println("After removing: " + ch + " character\n Result string: " + result);

        sc.close();

    }
}
