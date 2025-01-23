public class ContainsDigit2 {
    public static void main(String[] args) {
        
        String input = "Hello123World" ; 

        boolean containsDigit = false ; 

        for(char ch : input.toCharArray()){
            // check if the character is a digit by its ASCII range 

            if(ch >= '0' && ch <= '9'){
                containsDigit = true ; 
                break ; 
            }
        }

        if(containsDigit){
            System.out.println("\n string contains digit");
        }
        else{
            System.out.println("\n string doesn't contains digit");
        }
    }
}
