package String;

public class CharacterCount {
    public static void main(String[] args) {
        
        String input = " sonu nm " ; 
        input = input.trim() ; // trim only removes the leading and trailing spaces and not the space in between 

        int nonSpaceCharacterCount = 0 ; 

        char[] inputArray = input.toCharArray() ; 

        for(char ch: inputArray){
            if(ch != ' '){
                nonSpaceCharacterCount++ ; 
            }
        }

        System.out.println("\n no of characters (excluding spaces): " + nonSpaceCharacterCount);
    }
}
