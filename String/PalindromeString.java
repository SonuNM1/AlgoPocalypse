package String ; 

public class PalindromeString{
    public static void main(String[] args) {
        
        String name = "sonu" ; 
        String reverse = "" ; 

        name = name.toLowerCase() ; 

        for(int i=name.length()-1 ; i >= 0; i--){
            reverse += name.charAt(i) ; 
        }

        if(name.equals(reverse)){
            System.out.println("\n " + name + " is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}