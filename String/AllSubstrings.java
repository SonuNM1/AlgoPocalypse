
/*
The goal is to find all possible substrings of a given string. 

Input: "abc"
Output: "a", "ab", "abc", "b", "bc", "c"
*/

package String;

import java.util.HashSet;
import java.util.Set;

public class AllSubstrings {
    public static void main(String[] args) {
        
        String input = "abc" ; 
        String inputSubString = "" ; 

        HashSet<String> subString = new HashSet<>() ; 

        for(int i=0 ; i < input.length() ; i++){
            for(int j=i+1 ; j <= input.length() ; j++){
                inputSubString = input.substring(i, j) ; 

                subString.add(inputSubString) ; 
            }
        }

        System.out.println("\n All substrings: \n" + subString);

    }
}
