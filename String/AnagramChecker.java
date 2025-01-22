package String;

/*
They contain the same characters.
Each character appears the same number of times.
The order of characters does not matter.

eg: listen and silent, triangle and integral 
*/

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        
        String word = "silent" ; 
        String word2 = "listen" ; 

        if(word.length() != word2.length()){
            System.out.println("\n not anagram");
            return ; 
        }

        // convert the character arrays 

        char[] wordChar = word.toCharArray() ;
        char[] word2Char = word.toCharArray() ; 

        // sort the character arrays 

        Arrays.sort(wordChar) ; 
        Arrays.sort(word2Char) ; 

        boolean isAnagram = true ; 

        for(int i=0 ; i < wordChar.length ; i++){
            if(wordChar[i] != word2Char[i]){
                isAnagram = false ; 
                break ; 
            }
        }

        if(isAnagram){
            System.out.println("\n anagram");
        }
        else{
            System.out.println("\n not anagram");
        }

    }
}
