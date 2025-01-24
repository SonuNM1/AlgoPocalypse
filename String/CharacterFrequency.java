
/*
Given a string and a specific character, the task is to count the number of times the given character appears in the string.
*/

public class CharacterFrequency {
    public static void main(String[] args) {
        
        String input = "several words" ; 
        char targetChar = 's' ;

        if(input.length() == 0){
            System.out.println("\n no input string");
        }

        int count = 0 ; 

        for(char ch : input.toCharArray()){
            if(ch == targetChar){
                count ++ ; 
            }
        }

        System.out.println("\n count: " + count);

    }
}
