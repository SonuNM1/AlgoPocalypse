public class ContainsDigit3 {
    public static void main(String[] args) {
        
        String input = "hello123world" ; 

        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'} ; 

        boolean containsDigit = false ; 

        for(char ch : input.toCharArray()){
            for(char digit : digits){
                if(ch == digit){
                    containsDigit = true ; 
                    break ; 
                }
            }
            if(containsDigit){
                break ; // exit the outer loop 
            }
        }
        

    }
}
