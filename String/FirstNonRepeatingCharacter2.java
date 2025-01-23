
/*
Find the first non-repeating (unique) character in a given string. A non-repeating character is one that appears exactly once in the string.

Explanation
Input:

You are given a string, which can contain any characters including letters, digits, and symbols.
Output:

You need to return or print the first character in the string that appears only once. If all characters repeat or if there are no unique characters, you should return or print a message indicating that no such character exists.
 */

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter2 {
    public static void main(String[] args) {
        
        String input = "Sonu NM" ; 
        input = input.toLowerCase() ; 

        Map<Character, Integer> inputMap = new HashMap<>() ; 

        System.out.println("\n Printing the character and their frequency count: ");

        for(Map.Entry<Character,Integer> entry : inputMap.entrySet()){
            int key = entry.getKey() ; 
            int value = entry.getValue() ; 

            System.out.println(key + " : " + value);
        }

        // finding the character with count = 1 

        char firstNonRepeatingCharacter = ' ' ; 

        for(char ch : input.toCharArray()){
            if(inputMap.get(ch) == 1){
                firstNonRepeatingCharacter = ch ; 
                break ; 
            }
        }

        if(firstNonRepeatingCharacter != ' '){
            System.out.println("\n first non repeating character: " + firstNonRepeatingCharacter);
        }
        else{
            System.out.println("\n not found");
        }

    }
}
