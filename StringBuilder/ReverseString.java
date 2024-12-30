package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        
        String name = "Sonu" ; 

       String result = reverse(name);

       System.out.println("The reverse of: " + name + " is: " + result);
    }   
    public static String reverse(String s){

        StringBuilder reverseName = new StringBuilder() ; 

        for(int i=s.length()-1 ; i >= 0 ; i--){
            char ch = s.charAt(i) ; 

            reverseName.append(ch) ; 
        }

        return reverseName.toString() ; // convert stringbuilder to string
       
    }
}
