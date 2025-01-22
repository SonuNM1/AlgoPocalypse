package String;

/*
Given two strings, determine if they share a common substring. A substring is defined as a contiguous sequence of characters in a string. If there exists at least one common substring, return true; otherwise, return false.

Input:

s1 = "abc"
s2 = "def"
Output:

false (no common substring)
*/

import java.util.HashSet ; 

public class TwoStringSubstring {
    public static void main(String[] args) {

        String s1 = "hello" ; 
        String s2 = "world" ; 

        HashSet<String> allSubStrings = new HashSet<>() ; 

        boolean found = false ; 

        // generating all substrings of s1

        for(int i=0 ; i < s1.length() ; i++){
            for(int j=i+1 ; j <= s1.length() ; j++){
                String substring = s1.substring(i, j) ; 

                allSubStrings.add(substring) ; 
            }
        }

        // check if any substring of s2 exists in the hashset 

        for(int i=0 ; i < s2.length() ; i++){
            for(int j=i+1 ; j <= s2.length() ; j++){
                if(allSubStrings.contains(s2.substring(i, j))){
                    found = true ; 
                }
            }
        }

    }    
}
